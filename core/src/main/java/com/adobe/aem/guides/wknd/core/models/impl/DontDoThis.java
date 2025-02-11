package com.adobe.aem.guides.wknd.core.models.impl;

public class DontDoThis implements Runnable {
  private Thread thread;

  public void start() {
    thread = new Thread(this);
    thread.start();
  }

  public void stop() {
    thread.stop(); // UNSAFE!
  }

  public void run() {
    while (true) {
      // TBD
    }
  }
}
