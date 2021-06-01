package com.example.myprob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonStart = (Button)findViewById(R.id.btn_lvl1_exit);
buttonStart.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        try {
            Intent intent = new Intent(MainActivity.this, Lvl1.class);
            startActivity(intent); finish();
        } catch (Exception e){
    }
    }
});
        Button btn_v1 = (Button) findViewById(R.id.author);
        btn_v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent_1 = new Intent(MainActivity.this, Main_author.class);
                    startActivity(intent_1);
                    finish();
                } catch (Exception e) {
                }
            }
        });
    }
}