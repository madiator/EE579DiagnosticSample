package edu.usc.anrg.ee579.diagnostic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import edu.usc.anrg.ee579.diagnostic.protocol.Packet;

public class Client {
  private OutputStream outToServer = null;
  private BufferedReader inFromServer = null;
  private Socket clientSocket = null;
  private final String defaultServerIP = "127.0.0.1";
  private final int defaultServerPort = 9777;

  public Client() throws IOException {
    initializeClient(defaultServerIP, defaultServerPort);
  }
  
  public Client(String serverIP, int serverPort) {    
    initializeClient(serverIP, serverPort);
  }
  private void initializeClient(String serverIP, int serverPort) {
    //TODO: Set up the sockets etc. 
  }

  public void sendMessage(String msg) throws IOException{
    Packet packet = new Packet(msg);
    //TODO: Send packet
  }

  public String recvMessage() {
    Packet packet = new Packet();    
    packet.readPacket(inFromServer);
    return packet.getMessage();
  }

  public boolean closeConnection() {
    try {
      clientSocket.close();
      return true;
    }catch(IOException e) {
      e.printStackTrace();
      return false;
    }
  }
}
