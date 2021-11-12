package com.example.ej7eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;
    private TextView  firstText;
    private  float rotation=45.0F;
    private RadioGroup rgSelection;
    private Button btnAceptar;
    private  RadioButton rbtText;
    private  RadioButton rbtImage;
    private ImageView image;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicilizarElementos();





       btnAceptar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               rotation=0;
               if (rbtText.isChecked()){
                    ocultarMenu();
                   tvText.setVisibility(View.VISIBLE);

               } else if (rbtImage.isChecked()){
                   ocultarMenu();
                   image.setVisibility(View.VISIBLE);

               }
           }
       });


        tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                tvText.setRotation(rotation);
                tvText.setText("HOOOOOOLA!!!!!");
                tvText.setBackgroundColor(getResources().getColor(R.color.green));
                tvText.setTextSize(35);
                rotation+=45.0F;
                if (rotation >=316){
                    rotation=0.0F;
                }
            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                image.setRotation(rotation);
                rotation+=45.0F;
                if (rotation >=316){
                    rotation=0.0F;
                }

            }
        });





    }

    public  void  inicilizarElementos(){
        tvText = findViewById(R.id.tvText);
        rgSelection = findViewById(R.id.rgSelection);
        btnAceptar = findViewById(R.id.btnAceptar);
        firstText = findViewById(R.id.firstText);
        rbtText = findViewById(R.id.rbtSi);
        rbtImage = findViewById(R.id.rbtNo);
        image = findViewById(R.id.Image);
    }

    public void ocultarMenu(){
        firstText.setVisibility(View.GONE);
        btnAceptar.setVisibility(View.GONE);
        rgSelection.setVisibility(View.GONE);


    }
}