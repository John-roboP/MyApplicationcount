package com.t_robop.otaka.myapplicationcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plus(View view){
    //足す
        mcount++;
        TextView countView=(TextView)findViewById(R.id.textView1);
        countView.setText(String.valueOf(mcount));
    }
    public void clear(View view){
        //0にする
        mcount=0;
        TextView countView=(TextView)findViewById(R.id.textView1);
        countView.setText(String.valueOf(mcount));
    }



}
