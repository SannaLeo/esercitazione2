package com.example.esercitazione2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nome, cognome, data;
    TextView  eta;
    Button inserisci;
    SeekBar sickbar;
    Persona persona;
    public static final String PERSONA_PATH = "com.example.esercitazione2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = findViewById(R.id.attributonome);
        cognome = findViewById(R.id.attributocognonome);
        data = findViewById(R.id.attributoData);
        eta = findViewById(R.id.etas);
        inserisci = findViewById(R.id.saveButton);
        sickbar = findViewById(R.id.sickbar);
        persona = new Persona();


        inserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ShowResult = new Intent(MainActivity.this, ResultActivity.class);
                updatePerson();
                ShowResult.putExtra(PERSONA_PATH, persona);
                startActivity(ShowResult);
            }
        });

        sickbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                eta.setText(""+sickbar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                eta.setText(""+sickbar.getProgress());
            }
        });
    }
    public void updatePerson(){
        this.persona.setNome(this.nome.getText().toString());
        this.persona.setCognome(this.cognome.getText().toString());
        this.persona.setData_di_nascita(this.data.getText().toString());
        this.persona.setEta(this.eta.getText().toString());
    }

}