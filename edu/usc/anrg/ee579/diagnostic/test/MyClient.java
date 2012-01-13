package edu.usc.anrg.ee579.diagnostic.test;

import java.io.IOException;

import edu.usc.anrg.ee579.diagnostic.Client;

public class MyClient {
  public static void main(String args[]) throws Exception{
    try {
      Client client = new Client();
      client.sendMessage("Hello");
      
      //TODO: Do other stuff here.
      
      client.sendMessage("End");
      boolean isDisconnected = client.closeConnection();
      if(isDisconnected)
        System.out.println("Connection with server closed successfully");
      else
        System.out.println("Something went wrong while closing the connection");
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
