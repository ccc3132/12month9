package com.example.ss.myapplication;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
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


        c1 = (Chronometer) findViewById(R.id.chronometer3);
        b1 = (Button) findViewById(R.id.button);
        C1 = (CalendarView) findViewById(R.id.calendarView);
        t1 = (TimePicker) findViewById(R.id.timePicker);

        C1.setVisibility(View.INVISIBLE);
        t1.setVisibility(View.INVISIBLE);

        b1.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v){
                c1.setBase(SystemClock.elapsedRealtime());
                c1.start();
               c1.setTextColor(Color.RED);
            }
        });





    }
}
