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
class ExtendingExample
{
   public static void main(String args[])
   {
      Count cnt = new Count();
      try
      {
         while(cnt.isAlive())
         {
           System.out.println("Main thread will be alive till the child thread is live");
           Thread.sleep(1500);
         }
      }
      catch(InterruptedException e)
      {
        System.out.println("Main thread interrupted");
      }
      System.out.println("Main thread's run is over" );
   }
}

class Count extends Thread
{
   Count()
   {
     super("my extending thread");
     System.out.println("my thread created" + this);
     start();
   }
   public void run()
   {
     try
     {
        for (int i=0 ;i<10;i++)
        {
            double Acosi = Math.acos(60); 
           System.out.println("Printing the count " + i + "Acosi is " + Acosi);
           double x = Math.PI;
           x = Math.toRadians(x);
           double Acosij = Math.acos(x);
           System.out.println("acos value of Acosj : "+Acosij);
           Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("my thread interrupted");
     }
     System.out.println("My thread run is over" );
   }
}
