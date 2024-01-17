package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) 
    {
        try 
        {
            Socket socket = new Socket("localhost", 3000);

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = input.readLine();
            System.out.println("Server response: " + response);

            socket.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
