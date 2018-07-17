package com.example.taehun.practice;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.nhn.android.maps.NMapActivity;
import com.nhn.android.maps.NMapView;

public class MainActivity extends NMapActivity {

    Button button1;
    Button button2;

    //지역변수가 더 좋다고 하이라이트 되는거 같은데 그냥 전역으로 씀.
    private LinearLayout mapLayout; //private ViewGroup mapLayout; 안돼서 LinearLayout 으로 바꿈
    private NMapView mMapView;
    private final String CLIENT_ID = "nhGQ8oQrA0kBxYqNyUz8";// 애플리케이션 클라이언트 아이디 값

    //맵가져오면서 초기화해준다. 공식 튜토리얼에서 조금변형된거임.
    private void init(){
        mMapView = new NMapView(this);
        mMapView.setClientId(CLIENT_ID); // 클라이언트 아이디 값 설정
        mMapView.setClickable(true);
        mMapView.setEnabled(true);
        mMapView.setFocusable(true);
        mMapView.setFocusableInTouchMode(true);
        mMapView.setScalingFactor(1.5f);
        mMapView.requestFocus();

        mapLayout = findViewById(R.id.map);
        mapLayout.addView(mMapView);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.airport.kr/ap/ko/index.do"));
                startActivity(mIntent);
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}