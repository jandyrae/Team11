package com.example.team11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
//import com.example.recycler.adapter.SessionAdapter;
//import com.example.recycler.model.Session;
import java.util.ArrayList;

public class MainActivityAshley extends AppCompatActivity {
    private ArrayList<SessionAshley> sessionArrayList;
    private RecyclerView rvSessions;
    private static final String tAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        generateData();
        setData();
    }
    private void init(){
        sessionArrayList = new ArrayList<>();
        rvSessions = findViewById(R.id.rv_sessions);
    }

    private void generateData(){
        sessionArrayList.add(new SessionAshley("BIO101", "03/10/2021", "1:45"));
        sessionArrayList.add(new SessionAshley("CS246", "03/11/2021", "2:15"));
        sessionArrayList.add(new SessionAshley("CS246", "03/13/2021", "1:22"));
        sessionArrayList.add(new SessionAshley("BIO101", "03/13/2021", "1:15"));
        sessionArrayList.add(new SessionAshley("CS246", "03/15/2021", "1:55"));
        sessionArrayList.add(new SessionAshley("CS246", "03/16/2021", "1:15"));
        sessionArrayList.add(new SessionAshley("BIO101", "03/17/2021", "0:48"));
        sessionArrayList.add(new SessionAshley("BIO101", "03/18/2021", "1:20"));
        sessionArrayList.add(new SessionAshley("CS246", "03/20/2021", "1:00"));
        sessionArrayList.add(new SessionAshley("BIO101", "03/21/2021", "2:15"));
        sessionArrayList.add(new SessionAshley("CS246", "03/22/2021", "2:18"));
        sessionArrayList.add(new SessionAshley("CS246", "03/22/2021", "1:10"));
        sessionArrayList.add(new SessionAshley("BIO101", "03/23/2021", "1:55"));
        sessionArrayList.add(new SessionAshley("BIO101", "03/24/2021", "1:35"));
    }

    private void setData(){
        rvSessions.setLayoutManager(new LinearLayoutManager(this));
        rvSessions.setAdapter(new SessionAdapter(this, sessionArrayList));
    }
}
