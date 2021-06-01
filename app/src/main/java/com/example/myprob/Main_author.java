package com.example.myprob;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main_author extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.author);
        TextView text_in_lighthouse = (TextView)findViewById(R.id.in_lighthouse);
        text_in_lighthouse.setText(Html.fromHtml(getString(R.string.about_author)));
        Button btn_lvl1_exit = (Button)findViewById(R.id.btn_lvl1_exit);
        btn_lvl1_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Main_author.this, MainActivity.class);
                    startActivity(intent); finish();
                } catch (Exception e){
                }
            } });

    }
}
