package com.example.shpargalka;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView teamName = (TextView) findViewById(R.id.headline);
        WebView teamInfo = (WebView) findViewById(R.id.teamInfo);
        teamInfo.setWebViewClient(new WebViewClient());
        String teamNameString = getIntent().getExtras().getString("teamName");
        String teamInfoString = getIntent().getExtras().getString("teamInfo");

        teamName.setText(teamNameString);
        teamInfo.loadUrl(teamInfoString);
    }
}
