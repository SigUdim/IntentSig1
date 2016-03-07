package com.sigudim.intentsig1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        final Button buttonScreen1 = (Button) findViewById(R.id.button_screen1);
        buttonScreen1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Create an explicit Intent for starting the Screen2
                // Activity
                Intent Screen1Intent = new Intent(Screen2.this,
                        Screen1.class);

                // Use the Intent to start the HelloAndroid Activity
                startActivity(Screen1Intent);
            }
        });
    }
}
