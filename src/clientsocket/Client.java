/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientsocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author majd1
 */
public class Client {
    public static void main(String[] args) throws IOException 
    { 
        InetAddress ip = InetAddress.getLocalHost(); 
        int port = 3006; 
        Scanner sc = new Scanner(System.in); 
  
        //  Open the socket connection. 
        Socket s = new Socket(ip, port); 
  
        //  Communication-get the input and output stream 
        DataInputStream inputStream = new DataInputStream(s.getInputStream()); 
        DataOutputStream outputstream = new DataOutputStream(s.getOutputStream()); 
  
        while (true) 
        { 
            System.out.print("Enter the equation in the form: "); 
            System.out.println("'first number operation second number'"); 
  
            String expression = sc.nextLine(); 
  
            if (expression.equals("exit")) 
                break; 
  
            // send the equation to server 
            outputstream.writeUTF(expression); 
  
            // wait till request is processed and sent back to client 
            String result = inputStream.readUTF(); 
            System.out.println("Server excution done !!!\nresult=" + result); 
            System.out.println("---------------------------------------------");
        } 
        s.close();
        inputStream.close();
        outputstream.close();
    } 
}
