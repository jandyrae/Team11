package com.example.team11;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RequiresApi(api = Build.VERSION_CODES.N)
public class Calendar extends AppCompatActivity {
android.icu.util.Calendar calendar = android.icu.util.Calendar.getInstance(Locale.ENGLISH);
    CalendarView calendarView;
    TextView myDate;
    String date;
    Context context;
    List<Session> sessions= new ArrayList<>();
    List<Date> dates = new ArrayList<>();
//    List<Courses> courses = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        myDate = (TextView) findViewById(R.id.myDate);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                date =  (month + 1) + "/" + dayOfMonth + "/" + year;
                myDate.setText(date); // lets the myDate field display the date
//                myDate.getText(); // can only return same type as intake

            }
        });
    }

}