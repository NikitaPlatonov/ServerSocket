package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    final static String host = "127.0.0.1";
    final static int port = 8090;
    public static void main(String[] args) throws Exception {
        try(Socket socket = new Socket(host, port); PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            System.out.println(in.readLine());
            out.println("Hi. Im connect!");
        }
    }
}
