package com.example.team11;

import java.util.Date;

public class SessionAshley {
    private String coursename;
    private String date;
    private String time;

    public SessionAshley(String coursename, String date, String time){
        this.coursename = coursename;
        this.date = date;
        this.time = time;
    }

    public String getName(){
        return coursename;
    }
    public String getDate(){
        return date;
    }
    public String getTime(){
        return time;
    }
}
