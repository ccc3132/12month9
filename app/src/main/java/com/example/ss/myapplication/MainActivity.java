package com.example.ss.myapplication;

import android.graphics.Color;
import android.icu.util.Calendar;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
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

        final TextView T2;
        final TextView T3;
        final TextView T4;
        final TextView T5;
        final TextView T6;
        final Button b2;


        c1 = (Chronometer) findViewById(R.id.chronometer3);
        b1 = (Button) findViewById(R.id.button);
        C1 = (CalendarView) findViewById(R.id.calendarView);
        t1 = (TimePicker) findViewById(R.id.timePicker);
        Ra1 = (RadioGroup) findViewById(R.id.radiogroup);
        r1 = (RadioButton) findViewById(R.id.radioButton);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        T2 = (TextView) findViewById(R.id.textView2);
        T3 = (TextView) findViewById(R.id.textView3);
        T4 = (TextView) findViewById(R.id.textView4);
        T5 = (TextView) findViewById(R.id.textView5);
        T6 = (TextView) findViewById(R.id.textView6);
        b2 = (Button) findViewById(R.id.button2);




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

        b2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                c1.stop();
                c1.setTextColor(Color.BLUE);
                java.util.Calendar curDate = java.util.Calendar.getInstance();
                curDate.setTimeInMillis(C1.getDate());
                T2.setText(Integer.toString(curDate.get(java.util.Calendar.YEAR))+"년");
                T3.setText(Integer.toString(curDate.get(java.util.Calendar.MONTH))+"월");
                T4.setText(Integer.toString(curDate.get(java.util.Calendar.DATE))+"일");

                T5.setText(Integer.toString(t1.getCurrentHour())+"시");
                T6.setText(Integer.toString(t1.getCurrentMinute())+"분");

            }
        });



    }
}
