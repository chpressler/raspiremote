package io.github.chpressler.jremote;

import io.github.chpressler.jremote.interfaces.IDevice;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by christian on 11/6/16.
 */
public class JRemote {

    public static void main(String[] args) {

        //Server server = null;
        WebSocketClient client = null;

        try {
//            server = new Server();
//            server.start();

            client = new WebSocketClient();

            System.out.println(JRemote.class.getSimpleName() + " Version: " + getVersion() + " started. \nTo quit type in exit or quit or call rest service.");
            Scanner s = new Scanner(System.in);

            String nextLine;
            while (!(nextLine = s.next()).equals("exit") && !nextLine.equals("quit")) {
                if(nextLine.equals("devices")) {
                    System.out.println("registered devices:");
                    for(IDevice d : DeviceHandler.getInstance().getDevices()) {
                        System.out.println("Device id: " + d.getId() + " - class: " + d.getClass().getName());
                    }
                } else if(nextLine.equals("websocket")) {
                    String str = "websocket client " + ((client.getSession() == null) ? " not connected, no session available " : "session: " + client.getSession().getId() + " - open: " + client.getSession().isOpen());
                    Logger.getLogger(JRemote.class.getName()).log(Level.INFO, str);
                } else if(nextLine.equals("reconnect")) {
                    client.connect();
                } else {
                    System.out.println("invalid command");
                }
            }
        } catch(Exception e) {
            System.out.println(JRemote.class.getSimpleName() + " Version: " + getVersion() + " could not be started. Reason: " + e.getMessage());
            //e.printStackTrace();
        } finally {
//            try {
//                server.shutdown();
//            } catch(Exception e1) {
//                e1.printStackTrace();
//            }
            if(client != null && client.getSession() != null) {
                try {
                    client.close();
                } catch (Exception e) {
                    Logger.getLogger(JRemote.class.getName()).log(Level.SEVERE, "WebSocket client could not be closed. Reason: " + e.getMessage());
                }
            }
        }

    }

    public static String getVersion() {
        return "1.0"; //TODO - read from pom.xml
    }

//    private static void triggerDevice(String message) {
//        System.out.println("trigger received: " + message);
////        //parse Message
////        //String id = ...
////        for(IDevice d : DeviceHandler.getInstance().getDevices()) {
////            if(d.getId().equals(id)) {
////                d.
////            }
////        }
//    }

}
