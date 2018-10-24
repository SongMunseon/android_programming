package com.example.igchun.buttonevent1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class MyListenerClass implements View.OnClickListener {
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "버튼이 눌려졌습니다", Toast.LENGTH_SHORT).show();
        }
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        MyListenerClass buttonListener = new MyListenerClass();
        button.setOnClickListener(buttonListener);
    }
}
