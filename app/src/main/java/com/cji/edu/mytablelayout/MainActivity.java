package com.cji.edu.mytablelayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 아이디로 컨트롤 변수 만들어줌
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        final EditText editText1 = (EditText)findViewById(R.id.editText1);
        final EditText editText2 = (EditText)findViewById(R.id.editText2);

        // 버튼 색깔
        button1.setBackgroundColor(Color.DKGRAY);
        button2.setBackgroundColor(Color.GRAY);

        // 버튼 클릭
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "배고파요", Toast.LENGTH_SHORT).show();
                editText1.setText("배고파");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "집에가요", Toast.LENGTH_SHORT).show();
                editText2.setText("집에가요");
            }
        });
    }
}
