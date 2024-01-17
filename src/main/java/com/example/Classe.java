package com.example;

import java.util.ArrayList;

public class Classe 
{
    String nomeClasse = "";
    ArrayList<Studente> listaStudenti;

    public Classe(String nomeClasse)
    {
        this.nomeClasse = nomeClasse;
        listaStudenti = new ArrayList<Studente>();
    }
    public Classe(){
    }

    public ArrayList<Studente> getListaStudenti() 
    {
        return listaStudenti;
    }

    public String getNomeClasse() 
    {
        return nomeClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    public void setListaStudenti(ArrayList<Studente> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    @Override
    public String toString() {
        return this.nomeClasse;
    }
    
}
