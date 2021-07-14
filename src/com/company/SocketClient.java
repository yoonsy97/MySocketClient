package com.company;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClient {

    public static void main(String[] args) {
	// write your code here
        try{
            Socket socket=null;

            socket=new Socket(InetAddress.getLocalHost(),5000);
            System.out.println("connect to server");

            //ListeningThread t1=new ListeningThread(socket);
            ListeningThread t1=new ListeningThread(socket);
            WritingThread t2= new WritingThread(socket);

            t1.start();
            t2.start();
        }
        catch(IOException e){


        }
    }
}
