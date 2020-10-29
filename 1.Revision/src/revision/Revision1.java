package revision;

import java.awt.Toolkit;
import java.util.Scanner;
public class Revision1 {
	static Scanner input = new Scanner(System.in);
	static int balance[] = {500};
	static int pin[] = {123};
	static int sub=0;
	static int overdraft[] = {1};

	public static void main(String[] args) {
		login();
		menu();
	}//end main method
	public static void login() {
		String strinput;
		int pincheck;
		boolean flag=false;
		System.out.print("Enter your pin: ");
		strinput = input.next();
		pincheck = validate(strinput, 1);
		
		for(int i=0;i<pin.length;i++) {
			if(pincheck==pin[i]) {
				sub=i;
				System.out.print("Welcome User, Please Choose an option\n ");
				flag=true;
				menu();
			}//end if
		}//end for
		while(flag==false) {
			System.out.println("Pin Not Found ");
			Toolkit.getDefaultToolkit().beep();
			login();
		}//end while
	}//end login method
	
	public static void menu() {
		int choice;
		String strinput;
		System.out.println("\n1.Show balance\n2.Withdraw\n3.Lodge\n4.Exit");
		System.out.print("Enter your option: ");
		strinput = input.next();
		choice = validate(strinput, 2);
		
		switch(choice) {
			case 1:showBalance();break;
			case 2:withdrawMoney();break;
			case 3:lodgeMoney();break;
			case 4:exitMethod();break;
		}//end switch
	}//end menu
	
	public static void exitMethod() {
		System.out.println("See Ya");
		System.exit(0);
	}//end exitMethod
	
	public static void lodgeMoney() {
		int lodge=0;
		String strinput="";
		System.out.print("How much do you wish to lodge: ");
		strinput = input.next();
		lodge = validate(strinput, 3);
		
		balance[sub] = balance[sub] + lodge;
		showBalance();
	}//endlodgeMethod
	
	public static void withdrawMoney() {
		int withdraw=0;
		String strinput="";
		System.out.print("How much do you wish to withdraw: ");
		strinput = input.next();
		withdraw = validate(strinput, 4);
		if(overdraft[sub] == 0) {
			while(withdraw>balance[sub]) {
				System.out.println("Insufficient Funds");
				System.out.println("How much do you wish to withdraw: ");
				strinput= input.next();
				withdraw = validate(strinput, 4);
			}//end while
		}//end if
		balance[sub]=balance[sub]-withdraw;
		showBalance();
		
	}//end withdrawMethod
	
	public static void showBalance() {
		System.out.println("Your balance is €" + balance[sub]);
		if(overdraft[sub] == 1) {
			System.out.println("Overdraft: Yes ");
		}//end if
		else {
			System.out.println("Overdraft: No ");
		}//end else
		System.out.println("Please choose another option: "); 
		menu();
		
	}//end showBalance

	
	//-------------Validate Methods--------------
	public static int validate(String strinput, int check) {
		int numinput=0;
		if(check==1) {
			while(!strinput.matches("\\d+")){ //check input is only digits
				System.out.print("Error, 3 digits only");  //print error
				Toolkit.getDefaultToolkit().beep();
				System.out.print("\nRe-enter Pin : ");//prompt for input
				System.out.println();
				strinput=input.next();  //take in input
			}//end while
			numinput=Integer.parseInt(strinput);
		}//end if
		else if(check==2) {
			while(!strinput.matches("[1-4]")){ //check input is only digits
				System.out.println("Error, digits between 1-4");  //print error
				Toolkit.getDefaultToolkit().beep();
				System.out.print("Enter your option: ");
				strinput=input.next();  //take in input
			}//end while
			numinput=Integer.parseInt(strinput);
		}//end else if
		else if(check==3) {
			while(!strinput.matches("\\d+")){  //check input is 3 digits
				System.out.println("Error digits only"); //print error message
				Toolkit.getDefaultToolkit().beep();
				System.out.print("How much do you wish to lodge: ");//prompt for input
				strinput=input.next();  //take input
			}//end while
			numinput=Integer.parseInt(strinput);
		}//end else if 
		else if(check==4) {
			while(!strinput.matches("\\d+")){  //check input is 3 digits
				System.out.println("Error, digits only"); //print error message
				Toolkit.getDefaultToolkit().beep();
				System.out.println("How much do you wish to withdraw: ");//prompt for input
				strinput=input.next();  //take input
			}//end while
			numinput=Integer.parseInt(strinput);
		}//end else if 
		return numinput;
		
	}//end validatePin
		
}//end class
	

