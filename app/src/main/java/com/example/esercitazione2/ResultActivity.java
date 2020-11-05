package com.example.esercitazione2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class ResultActivity extends AppCompatActivity {
    Persona persona;
    TextView nome, cognome, data, eta;
    Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        nome = findViewById(R.id.titlenome);
        cognome = findViewById(R.id.titlecognome);
        data = findViewById(R.id.titledata);
        eta = findViewById(R.id.titleeta);
        ok = findViewById(R.id.titlesaveButton);
        //intercettiamo l'intento
        Intent intent = getIntent();
        Serializable obj = intent.getSerializableExtra(MainActivity.PERSONA_PATH);
        if(obj instanceof Persona){
            this.persona = (Persona)obj;
        } else{
            this.persona = new Persona();
        }
        nome.setText(persona.getNome());
        cognome.setText(persona.getCognome());
        data.setText(persona.getData_di_nascita());
        eta.setText(persona.getEta());


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Reset = new Intent(ResultActivity.this, MainActivity.class);
                Resett();
                startActivity(Reset);
            }
        });
    }
    public void Resett(){
        this.persona.setNome("");
        this.persona.setCognome("");
        this.persona.setData_di_nascita("");
        this.persona.setEta("");
        nome.setText("");
        cognome.setText("");
        data.setText("");
        eta.setText("");
    }
}