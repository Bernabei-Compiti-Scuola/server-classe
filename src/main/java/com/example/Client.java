package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Client {
    public static void main(String[] args) 
    {
        try 
        {
            Socket socket = new Socket("localhost", 3000);

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            ObjectMapper objectMapper= new ObjectMapper();
            String response = input.readLine();
           
            Classe c = objectMapper.readValue(response, Classe.class);
            System.out.println(c.toString());
            socket.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
