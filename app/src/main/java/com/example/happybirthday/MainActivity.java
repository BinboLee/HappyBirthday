package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.codecontrol);


    }
    public void onClick(View v){
        TextView out=findViewById(R.id.textView3);
        out.setText("this is first kind");
    }
    public void onClick2(View v){
        TextView out=findViewById(R.id.textView3);
        out.setText("this is second kind");
    }
}
