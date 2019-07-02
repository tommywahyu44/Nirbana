package com.Tes.Nirbana;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button bt_borobudur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        bt_borobudur = (Button) findViewById(R.id.button_ar);
        bt_borobudur.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent( MainActivity.this, UnityPlayerActivity.class));
            }
        });
    }
}
