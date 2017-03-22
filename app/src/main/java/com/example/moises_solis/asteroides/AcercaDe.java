package com.example.moises_solis.asteroides;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AcercaDe extends AppCompatActivity {
    TextView tvacercade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acercade);
        tvacercade=(TextView)findViewById(R.id.tvacercade);
        tvacercade.setText(R.string.comentAcercaDe);
    }



}
