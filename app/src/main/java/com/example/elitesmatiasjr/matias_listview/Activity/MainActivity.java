package com.example.elitesmatiasjr.matias_listview.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.elitesmatiasjr.matias_listview.Adapter.CustomAdapter;
import com.example.elitesmatiasjr.matias_listview.Model.College;
import com.example.elitesmatiasjr.matias_listview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String Colleges[];
    String Year[];
    int[] logos;
    List<College> listColleges;

    CustomAdapter adapter;
    ListView lv_Colleges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_Colleges = (ListView) findViewById(R.id.lvColleges);
        listColleges = new ArrayList<College>();

        Colleges = getResources().getStringArray(R.array.Colleges);
        Year = getResources().getStringArray(R.array.Year);
        logos = new int[] {R.drawable.iics, R.drawable.engg, R.drawable.arki, R.drawable.educ, R.drawable.medi};

        for(int i=0; i < Colleges.length && i < Year.length; i++) {
            listColleges.add(new College(logos[i], Colleges[i], Year[i]));
        }

        adapter = new CustomAdapter(this, listColleges);
        lv_Colleges.setAdapter(adapter);


        lv_Colleges.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "You clicked " + Colleges[i];
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
