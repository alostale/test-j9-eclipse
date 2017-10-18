package org.alo.test.j9;

import javax.activation.DataHandler;   // in java.activation module
import javax.annotation.PostConstruct; // in java.xml.ws.annotation module

import java.sql.Date;
public class OldClass {
  public static void main(String[] args) {
    DataHandler dh = new DataHandler(null, null);
    System.out.println(dh);
  }
  
  @PostConstruct
  public void post() {
  }
}