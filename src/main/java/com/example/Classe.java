package com.example;

import java.util.ArrayList;

public class Classe 
{
    String nomeClasse = "";
    ArrayList<Studente> listaStudenti;

    Classe(String nomeClasse)
    {
        this.nomeClasse = nomeClasse;
        listaStudenti = new ArrayList<Studente>();
    }

    public ArrayList<Studente> getListaStudenti() 
    {
        return listaStudenti;
    }

    public String getNomeClasse() 
    {
        return nomeClasse;
    }
    public String toString()
    {
        String stringa = "";
        stringa += "Classe: " + nomeClasse + "           ";
        stringa += "Lista studenti: ";
        for(Studente studente : listaStudenti)
        {
            if (studente==listaStudenti.get(listaStudenti.size()-1))
                stringa += studente.getNome()+".";
            else
                stringa += studente.getNome()+", ";
        }
        return stringa;
    }
}
