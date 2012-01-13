package edu.usc.anrg.ee579.diagnostic.protocol;

import java.io.BufferedReader;



public class Packet extends Protocol {
  
 
  public Packet(String msg) {    
    this.message = msg;    
    msgLength = message.length();
    totalLength = HEADERLENGTH + msgLength;
    //TODO: more housekeeping stuff like above
    //TODO: initialize buffers
    //TODO: write to the buffer
  }

  public Packet() {
    
  }

  @Override
  public void readPacket(BufferedReader inFromBuffer) {
   
    // TODO: Read the packet. 
    /* Read the first four bytes to determine the API Type to verify its
     * correct. 
     * Then read the next four bytes to get the total length.
     * Similarly find the length of the message by reading the next four bytes. 
     * Finally read number of bytes equal to the message length and convert it
     * to a string and store in message. 
     */
  }
  
  // you can define your methods to perform what you want.
  // you do not necessarily have to do this way. 
  public void getMessageType() {
    
  }
  
  // you can define your methods to perform what you want.
  // you do not necessarily have to do this way. 
  public void getSomething(String text) {
    
  }
 
}
