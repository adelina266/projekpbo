/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectpbo3.server;

import java.net.ServerSocket;
import java.net.Socket;
import db.Parameter;
import javax.swing.JOptionPane;


public class StartServer {
    static ServerSocket server;
    static Socket client;
    static boolean signal = false;
    
    public StartServer(){
        try {
            System.out.println("Loading....please wait");
            JOptionPane.showMessageDialog(null,"Server Hidup");
            server = new ServerSocket(new Parameter().PORT);
            signal = true;
        }catch(Exception ex){
            signal = false;
        }
        if(signal = true){
            new connect("RunServer");
        }
    }

    public static class connect implements Runnable {

        Thread t;

        connect(String imeNiti){
            t = new Thread(this, imeNiti);
            t.start();
        }

        public void run() {
            while(true){
                try {
                    try {
                        client = server.accept();
                        System.out.println("Akses Client.....");
                        //JOptionPane.showMessageDialog(null,"Sebuah Client Server Terkoneksi dengan Server");
                    } catch (Exception e){
                        break;
                    }
                } catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}