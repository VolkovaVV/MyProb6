package com.example.myprob;
import android.text.Html;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lvl1_look_around extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.background_look_around);
        TextView text_look_around = (TextView)findViewById(R.id.text_look_around);
        text_look_around.setText(Html.fromHtml(getString(R.string.look_around)));
        Button btn_lvl1_exit = (Button)findViewById(R.id.btn_lvl1_exit);
        btn_lvl1_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Lvl1_look_around.this, MainActivity.class);
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
                    Intent intent_1 = new Intent(Lvl1_look_around.this, Lvl2_in_lighthouse.class);
                    startActivity(intent_1);
                    finish();
                } catch (Exception e) {
                }
            }
        });
    }
}
