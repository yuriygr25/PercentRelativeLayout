package com.example.yura.percentrelativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView infoTextView = (TextView)findViewById(R.id.textView);
        infoTextView.setText("Вверх");

    }

    public void onClick1(View view) {
        TextView infoTextView = (TextView)findViewById(R.id.textView);
        infoTextView.setText("Вниз");

    }

    public void onClick2(View view) {
        TextView infoTextView = (TextView)findViewById(R.id.textView);
        infoTextView.setText("");
    }
}
