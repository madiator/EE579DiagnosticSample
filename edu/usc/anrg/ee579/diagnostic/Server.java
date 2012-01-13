package edu.usc.anrg.ee579.diagnostic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
  private OutputStream outToClient = null;
  private BufferedReader inFromClient = null;
  private ServerSocket serverSocket = null;
  private Socket clientSocket = null;  
  private int serverPort = 9777;

  public Server() {    
    initializeServer(serverPort);
  }
  
  public Server(int serverPort) {
    this.serverPort = serverPort;
    initializeServer(serverPort);    
  }
  
  private void initializeServer(int serverPort) {
    //TODO: Set up the server to open on the serverPort
  }

  public void startServer() {
    //TODO: Read each packet, process it and respond if necessary. 
    /* you can do this in an infinite loop which 
     * terminates if an "END" message is received.  
     */
  }

  public void sendMessage(String msg) throws IOException{
    Packet packet = new Packet(msg);
    outToClient.write(packet.getByteArray());
  }
}
