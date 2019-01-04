package com.example.diego.miaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button  btvino, btron, btpisco, btwhisky, btcigarros, btotros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btron = (Button)findViewById(R.id.btron);
        btron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intend = new Intent(Main2Activity.this, ron.class);
                startActivity(intend);
            }
        });

        btpisco = (Button)findViewById(R.id.btpisco);
        btpisco.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                Intent intend = new Intent(Main2Activity.this, pisco.class);
                startActivity(intend);
                    }
        });

        btvino = (Button)findViewById(R.id.btvino);
        btvino.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                Intent intend = new Intent(Main2Activity.this, vino.class);
                startActivity(intend);
                            }
        });

        btwhisky = (Button)findViewById(R.id.btwhisky);
        btwhisky.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                Intent intend = new Intent(Main2Activity.this, whisky.class);
                startActivity(intend);

                                    }
        });

        btotros = (Button)findViewById(R.id.btotros);
        btotros.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                Intent intend = new Intent(Main2Activity.this, otros.class);
                startActivity(intend);
                                    }
        });

        btcigarros = (Button)findViewById(R.id.btcigarros);
        btcigarros.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                Intent intend = new Intent(Main2Activity.this, cigarros.class);
                startActivity(intend);
                                    }
        });
    }
}