package com.rohanx96.nd_myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar)findViewById(R.id.main_activity_toolbar));
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.spotify_button:
                Toast.makeText(this, R.string.toast_spotify_app,Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores_button:
                Toast.makeText(this, R.string.toast_score_app,Toast.LENGTH_SHORT).show();
                break;
            case R.id.library_button:
                Toast.makeText(this, R.string.toast_library_app,Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_bigger_button:
                Toast.makeText(this, R.string.toast_build_bigger_app,Toast.LENGTH_SHORT).show();
                break;
            case R.id.reader_button:
                Toast.makeText(this, R.string.toast_reader_app,Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone_button:
                Toast.makeText(this, R.string.toast_capstone_app,Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
