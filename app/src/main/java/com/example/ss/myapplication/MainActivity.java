package com.example.ss.myapplication;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    void init(){
        final Chronometer c1;
        final Button b1;
        final CalendarView C1;
        final TimePicker t1;
        final RadioGroup Ra1;
        final RadioButton r1;
        final RadioButton r2;

        c1 = (Chronometer) findViewById(R.id.chronometer3);
        b1 = (Button) findViewById(R.id.button);
        C1 = (CalendarView) findViewById(R.id.calendarView);
        t1 = (TimePicker) findViewById(R.id.timePicker);
        Ra1 = (RadioGroup) findViewById(R.id.radiogroup);
        r1 = (RadioButton) findViewById(R.id.radioButton);
        r2 = (RadioButton) findViewById(R.id.radioButton2);



        C1.setVisibility(View.INVISIBLE);
        t1.setVisibility(View.INVISIBLE);

        b1.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v){
                c1.setBase(SystemClock.elapsedRealtime());
                c1.start();
               c1.setTextColor(Color.RED);
            }
        });

        Ra1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(r1.isChecked()){
                    C1.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.INVISIBLE);
                }
                else if(r2.isChecked()){
                    t1.setVisibility(View.VISIBLE);
                    C1.setVisibility(View.INVISIBLE);
                }
            }
        });





    }
}
