package com.example.moksleivis.profoto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        final EditText vardasPris = findViewById(R.id.vardasPri);
        final EditText slaptazodisRegi = findViewById(R.id.slaptaPri);
        final EditText slaptazodisPak = findViewById(R.id.slaptPaka);
        final EditText elPastas = findViewById(R.id.pastasPri);

        Button siusti = findViewById(R.id.loginKurt);

        siusti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Validation.isValidCredentials(vardasPris.getText().toString()) && Validation.isValidCredentials(slaptazodisRegi.getText().toString()) && Validation.isValidCredentials(slaptazodisPak.getText().toString())
                        && Validation.isValidEmail(elPastas.getText().toString())) {
                    Vartotojas vartotojas = new Vartotojas(vardasPris.getText().toString(), slaptazodisRegi.getText().toString(), slaptazodisPak.getText().toString(), elPastas.getText().toString());

                    //cia vykdomas kodas , kai paspaudziamas mygtuka


                    // perejimui tarp langu                             is kur                   i kur
                    Intent goToLoginActivity = new Intent(RegisterActivity.this, LoginActivity.class);
                    // atidarome ta langa
                    startActivity(goToLoginActivity);
                } else {
                    Toast.makeText(RegisterActivity.this,
                            "Neteisingai ivesti duomenys", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
