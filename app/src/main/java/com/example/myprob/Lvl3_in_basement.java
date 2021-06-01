package com.example.myprob;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lvl3_in_basement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_basement);
        TextView text_look_around = (TextView)findViewById(R.id.text_look_around);
        text_look_around.setText(Html.fromHtml(getString(R.string.in_basement)));
        Button btn_lvl1_exit = (Button)findViewById(R.id.btn_lvl1_exit);
        btn_lvl1_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Lvl3_in_basement.this, MainActivity.class);
                    startActivity(intent); finish();
                } catch (Exception e){
                }
            }
        });
        Button btn_v1 = (Button) findViewById(R.id.btn_look_around_v1);
        btn_v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent_1 = new Intent(Lvl3_in_basement.this, Lvl3_death.class);
                    startActivity(intent_1);
                    finish();
                } catch (Exception e) {
                }
            }
        });
    }
}
