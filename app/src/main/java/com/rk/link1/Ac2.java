package com.rk.link1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Ac2 extends AppCompatActivity {

    EditText et1,et2;
    ImageButton ib1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac2);
     //   Intent rec=getIntent();
        et1=findViewById(R.id.et1_id);
        et2=findViewById(R.id.et2_id);
        ib1=findViewById(R.id.ib1_id);
    ib1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s1=et1.getText().toString();
            String s2=et2.getText().toString();
            Intent in=new Intent(Ac2.this,Ac3.class);
            in.putExtra("st_1",s1);
            in.putExtra("st_2",s2);
            startActivity(in);


        }
    });

    }
}
