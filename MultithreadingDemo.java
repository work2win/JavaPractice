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
class MultithreadingDemo extends Thread{  
  public void run(){  
    System.out.println("My thread is in running state.");  
  }   
  public static void main(String args[]){  
     MultithreadingDemo obj=new MultithreadingDemo();   
     obj.start();  
  }  
}
