package com.jeevaraj.ATM;

import java.util.*;
import java.text.DecimalFormat;

public class Account {
	private Long custnumber;
	private int pinnumber;
	private double checkingbalance;
	private double savingbalance;
	
	Scanner sc = new Scanner(System.in);
	
	DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00");

	public Long getcustnumber() {
		return custnumber;
	}

	public void setcustnumber(Long custnumber) {
		this.custnumber = custnumber;
	}

	public int getpinnumber() {
		return pinnumber;
	}

	public void setpinnumber(int pinnumber) {
		this.pinnumber = pinnumber;
	}
	
	public double getcheckingbalance() {
		return checkingbalance;
	}

	public double getsavingbalance() {
		return savingbalance;
	}

	public double calccheckingwithdraw (double amount) {
		checkingbalance = (checkingbalance - amount);
		return checkingbalance;
	}
	
	public double calcsavingwithdraw (double amount) {
		savingbalance = (savingbalance - amount);
		return savingbalance;
	}
	
	public double calccheckingdeposit (double amount) {
		checkingbalance = (checkingbalance + amount);
		return checkingbalance;
	}
	
	public double calcsavingingdeposit (double amount) {
		savingbalance = (savingbalance - amount);
		return savingbalance;
	}
	
	public void getcheckingwithdrawinput() {
		System.out.println("Checking Account Balance :" + moneyformat.format(checkingbalance));
		System.out.println("Amount you want to withdraw from checking Account : " );
		double amount = sc.nextDouble();
		
		if((checkingbalance - amount) >= 0)
		{
			calccheckingwithdraw(amount);
			System.out.println("New checking amount balance "+ moneyformat.format(checkingbalance));
		}
		else
		{
			System.out.println("Not Possible to WithDraw");
		}
	}

	public void getsavingwithdrawinput() {
		System.out.println("Saving Account Balance :" + moneyformat.format(checkingbalance));
		System.out.println("Amount you want to withdraw from saving Account : " );
		double amount = sc.nextDouble();
		
		if((checkingbalance - amount) >= 0)
		{
			calccheckingwithdraw(amount);
			System.out.println("New saving amount balance "+ moneyformat.format(checkingbalance));
		}
		else
		{
			System.out.println("Not Possible to WithDraw");
		}
	}
	
	public void getcheckingdepositeinput() {
		System.out.println("Checking Account Balance :" + moneyformat.format(checkingbalance));
		System.out.println("Amount you want to Deposite on checking Account : " );
		double amount = sc.nextDouble();
		
		if((checkingbalance + amount) >= 0)
		{
			calccheckingdeposit(amount);
			System.out.println("New checking amount balance "+ moneyformat.format(checkingbalance));
		}
		else
		{
			System.out.println("Not Possible to have -ve amount");
		}
	}

	public void getsavingdepositeinput() {
		System.out.println("Saving Account Balance :" + moneyformat.format(checkingbalance));
		System.out.println("Amount you want to withdraw from saving Account : " );
		double amount = sc.nextDouble();
		
		if((checkingbalance + amount) >= 0)
		{
			calccheckingdeposit(amount);
			System.out.println("New saving amount balance "+ moneyformat.format(checkingbalance));
		}
		else
		{
			System.out.println("Not Possible to have -ve amount");
		}
	}
}
