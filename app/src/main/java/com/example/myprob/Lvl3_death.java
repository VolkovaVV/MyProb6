package com.example.myprob;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lvl3_death extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.death_lvl3);
        TextView text_in_lighthouse = (TextView)findViewById(R.id.in_lighthouse);
        text_in_lighthouse.setText(Html.fromHtml(getString(R.string.death_lvl3)));
        Button btn_lvl1_exit = (Button)findViewById(R.id.btn_lvl1_exit);
        btn_lvl1_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Lvl3_death.this, MainActivity.class);
                    startActivity(intent); finish();
                } catch (Exception e){
                }
            } });
            Button btn_v1 = (Button) findViewById(R.id.btn_look_around_v1);
        btn_v1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent intent_1 = new Intent(Lvl3_death.this, Lvl3_in_basement.class);
                        startActivity(intent_1);
                        finish();
                    } catch (Exception e) {
                    }
                }
        });
    }
}
