package com.example.moksleivis.profoto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override     //onCreat metodas  lango uzkrovimas
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText slaptazodis = findViewById(R.id.slaptazodisEt);
        final EditText vardas = findViewById(R.id.vardasEt);
             // koda susieja  su vaizdu
        Button login = findViewById(R.id.loginBtn);
        Button register = findViewById(R.id.registerBtn);

       //mygtuko pavadinimas ir metodas setOnClickListener

        vardas.setError(null);
        slaptazodis.setError(null);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!Validation.isValidCredentials(vardas.getText().toString())) {
                    vardas.setError("Neteteisingai ivedete varda");
                    vardas.requestFocus();
                } else if (!Validation.isValidCredentials(slaptazodis.getText().toString())) {
                    slaptazodis.setError("Neteteisingai ivedete slaptazodi");
                    slaptazodis.requestFocus();
                }
                else {// geri prisijungimai
                    //cia vykdomas kodas , kai paspaudziamas mygtukas
                    Vartotojas vartotojas = new Vartotojas(vardas.getText().toString(), slaptazodis.getText().toString()); //objekto sukurimas
                    Toast.makeText(LoginActivity.this,

                            "Prisijungimo vardas: " + vartotojas.getVardas()+"\n"+
                                    "Slaptazodis: " + vartotojas.getSlaptazodis(), Toast.LENGTH_SHORT).show();

                    // perejimui tarp langu                             is kur                   i kur
                    Intent goToSearchActivity = new Intent(LoginActivity.this, MapsActivity.class);
                    // atidarome ta langa
                    startActivity(goToSearchActivity);

                }

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cia vykdomas kodas , kai paspaudziamas mygtukas

                // perejimui tarp langu                             is kur                   i kur
                Intent goToRegisterActivity = new Intent(LoginActivity.this, RegisterActivity.class);
                // atidarome ta langa
                startActivity(goToRegisterActivity);
            }
        });
    }


}
