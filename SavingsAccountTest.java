/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simu.account;

/**
 *
 * @author simu
 */
public class SavingsAccountTest {
    
    public static void main(String[] args)
	{
		SavingsAccount simuSavings = new SavingsAccount(1000, 0.10);
		simuSavings.withdraw(250);
		simuSavings.deposit(400);
		simuSavings.addInterest();
		System.out.println(simuSavings.getBalance());
		System.out.println("Expected: 1265.0");
		//1000-250=750 => 750+400=1150 => 1150+1150*0.10=1265.0
	}
}
