/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientsocket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author majd1
 */
public class Clientsocket {

    /**
     * @param args the command line arguments
     */
    private Socket socket = null;
    private Scanner scanin = null;
    private Scanner scanout = null;
    PrintStream printServer = null;

    public Clientsocket(String address, int port) {
        calculator cal = new calculator();
        cal.setVisible(true);
        cal.
        System.out.println(cal.click);
        if(cal.click){
            int number1 = cal.number1;
            int number2 = cal.number2;
            System.out.println(number1 + " "+ number2);
        }
  

        String operation = cal.operation;
//
//        try {
//            socket = new Socket(address, port);
//            System.out.println("connected");
//            scanin = new Scanner(System.in);
//            scanout = new Scanner(socket.getInputStream());
//            System.out.println("Enter the number :");
//
//        } catch (UnknownHostException e) {
//            System.out.println(e);
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
//        int number;
//        number = scanin.nextInt();
//        PrintStream printServer = null;
//        try {
//            printServer = new PrintStream(socket.getOutputStream());
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
//        printServer.println(number);
//        int serverMessage = scanout.nextInt();
//        System.out.println(serverMessage);
//        try {
//            socket.close();
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("done");
        Clientsocket clientsocket = new Clientsocket("127.0.0.1", 3006);

    }

}
