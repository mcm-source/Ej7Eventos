package com.example.ej7eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;
    private  float rotation=45.0F;
    private RadioGroup rgSelection;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvText = findViewById(R.id.tvText);
        rgSelection = findViewById(R.id.rgSelection);
        btnAceptar = findViewById(R.id.btnAceptar);

    }
}