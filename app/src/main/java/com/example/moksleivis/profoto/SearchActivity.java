package com.example.moksleivis.profoto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        Button entrySubmitKu = findViewById(R.id.entrySubmit);

        entrySubmitKu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cia vykdomas kodas , kai paspaudziamas mygtukas

                // perejimui tarp langu                             is kur                   i kur
                Intent goToNewEntryActivity = new Intent(SearchActivity.this, NewEntryActivity.class);
                // atidarome ta langa
                startActivity(goToNewEntryActivity);
            }
        });
    }


}




