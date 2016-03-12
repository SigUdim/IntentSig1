package com.sigudim.intentsig1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
       // text=(TextView)findViewById(R.id.tv1);
        final EditText editTextScreen2data=(EditText)findViewById(R.id.editText_screen2data);
        final Button buttonScreen1 = (Button) findViewById(R.id.button_screen1);
        buttonScreen1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String s=editTextScreen2data.getText().toString();

                // Create an explicit Intent for starting the Screen2
                // Activity
                Intent Screen1Intent = new Intent(Screen2.this,
                        Screen1.class);
                Screen1Intent.putExtra("data", s);
                // Use the Intent to start the HelloAndroid Activity
                startActivity(Screen1Intent);
            }
        });
    }
}
