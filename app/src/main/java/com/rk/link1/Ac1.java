package com.rk.link1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Ac1 extends AppCompatActivity {
    ImageButton bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac1);
        bt1=findViewById(R.id.ib1_id);
        bt1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent in=new Intent(Ac1.this,Ac2.class);
            startActivity(in);
        }
    });
    }
}
