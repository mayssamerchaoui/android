package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    private EditText Taille = null;
    private EditText Poids = null;
    private Button calculIMC = null;
    private TextView Resultat = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Taille = (EditText) findViewById(R.id.taille);
        Poids = (EditText) findViewById(R.id.poids);
        calculIMC = (Button) findViewById(R.id.btn);
        Resultat = (TextView) findViewById(R.id.Resultat);


        calculIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double t = Double.parseDouble(Taille.getText().toString());
                double p = Double.parseDouble(Poids.getText().toString());

                double r = p /(t*t);
                String IMC= "";


                if(r <=16){
                    IMC = "severely under weight";

                }else if(r < 18.5){
                    IMC = "under weight";


                }else if(r<= 25){
                    IMC = "normal weight";

                }else if(r<=30){
                    IMC = "overweight";

                }else{
                    IMC = "obese";
                }
                IMC="Resultat:" +r+ "=>" +IMC;
                Resultat.setText(IMC);



            }
        });




    }
}