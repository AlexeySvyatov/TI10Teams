package com.example.shpargalka;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Map<String, String> teamsMap = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamsMap.put("Team Spirit", getString(R.string.teamSpirit));
        teamsMap.put("PSG.LGD", getString(R.string.psgLgd));
        teamsMap.put("Team Secret", getString(R.string.teamSecret));
        teamsMap.put("INVICTUS GAMING", getString(R.string.iNVICTUSGAMING));
        teamsMap.put("Virtus.pro", getString(R.string.virtusPro));
        teamsMap.put("Vici Gaming", getString(R.string.viciGaming));
        teamsMap.put("OG", getString(R.string.oG));
        teamsMap.put("T1", getString(R.string.t1));
        teamsMap.put("Fnatic", getString(R.string.fnatic));
        teamsMap.put("Quincy Crew", getString(R.string.quincyCrew));
        teamsMap.put("Alliance", getString(R.string.alliance));
        teamsMap.put("Evil Geniuses", getString(R.string.evilGeniuses));
        teamsMap.put("Team Undying", getString(R.string.teamUndying));
        teamsMap.put("Team Aster", getString(R.string.teamAster));
        teamsMap.put("beastcoast", getString(R.string.beastcoast));
        teamsMap.put("Elephant", getString(R.string.elephant));

        ListView teamsListView = (ListView) findViewById(R.id.teamsListView);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, teamsMap.keySet().toArray());
        teamsListView.setAdapter(adapter);
        teamsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
                TextView textView = (TextView) view;
                String selectedItem = (String) textView.getText();
                String selectedInfo = teamsMap.get(selectedItem);

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("teamName", selectedItem);
                intent.putExtra("teamInfo", selectedInfo);
                startActivity(intent);
            }
        });
    }
}