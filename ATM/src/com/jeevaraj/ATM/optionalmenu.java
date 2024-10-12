package com.jeevaraj.ATM;

import java.util.*;
import java.text.DecimalFormat;
import java.io.IOException;

public class optionalmenu extends Account{
	Scanner sc = new Scanner(System.in);
	DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Long, Integer> data = new HashMap<Long, Integer>();
	
	public void getlogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(3196101021970L,1017);
				data.put(3196101021971L,1018);
				
				System.out.println("WELCOME TO THE AMT");
				System.out.println("Enter your Customer Number");
				setcustnumber(sc.nextLong());
				
				System.out.println("Enter your Pin ");
				setpinnumber(sc.nextInt());
			}
			catch(Exception e)
			{
				System.out.println("Invalid Character(s), only numbers are allowed "+"\n");
				x=2;
			}
			long cn = getcustnumber();
			int pn = getpinnumber();
			
			if(data.containsKey(cn) && data.get(cn) == pn)
			{
				getaccounttype();
			}
			else
			{
				System.out.println("Account Details are Wrong (pin) ");
			}
		}
		while(x==1);
	}
	public void getaccounttype() {
		System.out.println("Select the account you want to access");
		System.out.println("1) Checking Account");
		System.out.println("2) Saving Account");
		System.out.println("3) Exit");
		System.out.println();
		
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			getchecking();
			break;
			
		case 2:
			getsaving();
			break;
			
		case 3:
			System.out.println("Thanks for using the ATM");
			break;
			
		default:
			System.out.println("Invalid Option");
			getaccounttype();
		}
	}
	public void getchecking() {
		System.out.println("Checking Account ");
		System.out.println("1) View Balance");
		System.out.println("2) Withdraw Funds");
		System.out.println("3) Deposite Funds");
		System.out.println("4) Exit");
		
		System.out.println("Choice ?");
		
		int selection = sc.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Checking Account Balance :"+ moneyformat.format(getcheckingbalance()));
			getaccounttype();
			break;
		
		case 2:
			getcheckingwithdrawinput();
			getaccounttype();
			break;
			
		case 3:
			getcheckingdepositeinput();
			getaccounttype();
			break;
			
		case 4:
			System.out.println("Thanks for using the ATM");
			break;
			
		default:
			System.out.println("Invalid input");
			getchecking();
		}
	}
	
	public void getsaving() {
		System.out.println("Saving Account ");
		System.out.println("1) View Balance");
		System.out.println("2) Withdraw Funds");
		System.out.println("3) Deposite Funds");
		System.out.println("4) Exit");
		
		System.out.println("Choice ?");
		
		int selection = sc.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance :"+ moneyformat.format(getsavingbalance()));
			getaccounttype();
			break;
		
		case 2:
			getsavingwithdrawinput();
			getaccounttype();
			break;
			
		case 3:
			getsavingdepositeinput();
			getaccounttype();
			break;
			
		case 4:
			System.out.println("Thanks for using the ATM");
			break;
			
		default:
			System.out.println("Invalid input");
			getsaving();
		}
	}
}
