package com.example.moksleivis.profoto;

public class Vartotojas {
    private String vardas;
    private String slaptazodis;
    private String vardasPris;
    private String slaptazodisRegi;
    private String slaptazodisPak;
    private String elPastas;



    public Vartotojas(String vardas,String slaptazodis){
        this.vardas = vardas;
        this.slaptazodis = slaptazodis;

    }

    public Vartotojas(String vardasPris, String slaptazodisRegi, String slaptazodisPak, String elPastas){
        this.vardasPris = vardasPris;
        this.slaptazodisRegi = slaptazodisRegi;
        this.slaptazodisPak = slaptazodisPak;
        this.elPastas = elPastas;

    }
    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setSlaptazodis(String slaptazodis) {
        this.slaptazodis = slaptazodis;
    }

    public String getSlaptazodis() {
        return slaptazodis;
    }

    public String getElPastas() {
        return elPastas;
    }

    public void setElPastas(String elPastas) {
        this.elPastas = elPastas;
    }

    public void setVardasPris(String vardasPris) {
        this.vardasPris = vardasPris;
    }

    public String getVardasPris() {
        return vardasPris;
    }

    public void setSlaptazodisRegi(String slaptazodisRegi) {
        this.slaptazodisRegi = slaptazodisRegi;
    }

    public String getSlaptazodisRegi() {
        return slaptazodisRegi;
    }

    public void setSlaptazodisPak(String slaptazodisPak) {
        this.slaptazodisPak = slaptazodisPak;
    }

    public String getSlaptazodisPak() {
        return slaptazodisPak;
    }
}

