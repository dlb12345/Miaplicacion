package com.example.diego.miaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class cigarros extends AppCompatActivity {

    private Button btsumar, btrestar,btsumar1, btrestar1;
    private TextView tvcontar, tvcontar1;
    private int contador = 0;
    private int contador1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cigarros);

        tvcontar = (TextView)findViewById(R.id.tvcontar);
        tvcontar1 = (TextView)findViewById(R.id.tvcontar1);

        btrestar = (Button)findViewById(R.id.btrestar);
        btrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador--;
        tvcontar.setText(" "+contador);

            }
        });

        btsumar = (Button)findViewById(R.id.btsumar);
        btsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1++;
                tvcontar.setText(" "+contador);

            }
        });

        btsumar1 = (Button)findViewById(R.id.btsumar1);
        btsumar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1++;
                tvcontar.setText(" "+contador1);
            }
        });

        btrestar1 = (Button)findViewById(R.id.btrestar1);
        btrestar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1--;
                tvcontar1.setText(" "+contador1);

            }
        });
    }
}
