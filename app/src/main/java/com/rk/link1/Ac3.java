package com.rk.link1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ac3 extends AppCompatActivity {
    TextView tv1,tv2;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac3);
        Intent rec=getIntent();
        String s1=rec.getStringExtra("st_1");
        String s2=rec.getStringExtra("st_2");
        tv1=findViewById(R.id.tv1_id);
        tv2=findViewById(R.id.tv2_id);
        bt1=findViewById(R.id.bt1_id);
        tv1.setText(s1);
        tv2.setText(s2);
    bt1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent in=new Intent(Ac3.this,Ac1.class);
            startActivity(in);
        }
    });
    }
}
