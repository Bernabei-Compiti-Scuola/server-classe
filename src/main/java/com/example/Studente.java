package com.example;

public class Studente 
{
    String nome = "";

    public Studente(String nome)
    {
        this.nome = nome;
    }
    
    public Studente() {
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    public String getNome() 
    {
        return nome;
    }
}
