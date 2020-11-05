package com.example.esercitazione2;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nome, cognome, data_di_nascita, eta;


    public Persona (){
        this.nome = "";
        this.cognome = "";
        this.data_di_nascita = "";
        this.eta = "";
    }


    public Persona(String nome, String cognome, String data_di_nascita, String eta){
        this.nome = nome;
        this.cognome = cognome;
        this.data_di_nascita = data_di_nascita;
        this.eta = eta;
    }


    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getData_di_nascita() {
        return data_di_nascita;
    }
    public String getEta() {
        return eta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setData_di_nascita(String data_di_nascita) {
        this.data_di_nascita = data_di_nascita;
    }



    public void setEta(String eta) {
        this.eta = eta;
    }
}
