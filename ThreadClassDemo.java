/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simu;

/**
 *
 * @author simu
 */
public class ThreadClassDemo {
    
    public static void main(String args[]){
        
        Runnable hello = new DisplayMessage("simi");
        Thread thread1 = new Thread(hello);
        thread1.setDaemon(true);
        thread1.setName("simi");
        System.out.println("Starting simi thread");
        thread1.start();
        
        Runnable sumi = new DisplayMessage("sumi");
        Thread thread2 = new Thread(sumi);
        thread2.setDaemon(true);
        thread2.setName("sumi");
        System.out.println("Starting sumi thread");
        thread2.start();
        
        System.out.println("Starting thread3...");
      Thread thread3 = new GuessANumber(27);
      thread3.start();
      try {
         thread3.join();
      } catch (InterruptedException e) {
         System.out.println("Thread interrupted.");
      }
      System.out.println("Starting thread4...");
      Thread thread4 = new GuessANumber(75);
      
      thread4.start();
      System.out.println("main() is ending...");
    }
    
}
