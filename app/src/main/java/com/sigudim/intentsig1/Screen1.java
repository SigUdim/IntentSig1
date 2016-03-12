package com.sigudim.intentsig1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Screen1 extends AppCompatActivity {
    private TextView textViewData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        textViewData = (TextView)findViewById(R.id.textView_data);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        if(b!=null)
        {
            String j =(String) b.getString("data");
            textViewData.setText(j);
        }

        final Button buttonScreen2 = (Button) findViewById(R.id.button_screen2);
        buttonScreen2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Create an explicit Intent for starting the Screen2
                // Activity
                Intent Screen2Intent = new Intent(Screen1.this,
                        Screen2.class);

                // Use the Intent to start the HelloAndroid Activity
                startActivity(Screen2Intent);
            }
        });
    }
}
