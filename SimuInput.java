/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simu.basic;
import java.util.Scanner;
/**
 *
 * @author simu
 */
public class SimuInput {
    
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter an integer: ");
    	int number = input.nextInt();
    	System.out.println("You entered " + number);
    }
    
}
