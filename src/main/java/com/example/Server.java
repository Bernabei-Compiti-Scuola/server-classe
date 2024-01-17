package com.example;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Server 
{
    public static void main(String[] args) 
    {
        Classe classe = new Classe("4Binf");
        classe.getListaStudenti().add(new Studente("Mario"));
        classe.getListaStudenti().add(new Studente("Luigi"));
        classe.getListaStudenti().add(new Studente("Giovanni"));

        try 
        {
            // Creazione del socket del server sulla porta 3000
            ServerSocket serverSocket = new ServerSocket(3000);
            System.out.println("Server in avvio...");

            // Accettazione della connessione del client
            Socket clientSocket = serverSocket.accept();
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            System.out.println("Client connesso: ");

            ObjectMapper objectMapper =new ObjectMapper();
            String s =objectMapper.writeValueAsString(classe);
            out.writeBytes(s + "\n");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
