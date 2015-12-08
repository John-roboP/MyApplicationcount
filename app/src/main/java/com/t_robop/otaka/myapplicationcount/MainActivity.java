package com.t_robop.otaka.myapplicationcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mcount,ccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plus(View view){

        mcount++;
        TextView countView=(TextView)findViewById(R.id.textView1);
        countView.setText(String.valueOf(mcount));
    }
    public void clear(View view){
        ccount=0;
        TextView countView=(TextView)findViewById(R.id.textView1);
        countView.setText(String.valueOf(ccount));
    }


}
