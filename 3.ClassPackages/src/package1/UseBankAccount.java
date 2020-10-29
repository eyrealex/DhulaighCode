package package1;

import java.util.Scanner;
import package1.BankAccount;
public class UseBankAccount { //start class
	static String userPin;
	static Scanner input= new Scanner(System.in);

	public static void main(String[] args) {//start main
		BankAccount account[]= new BankAccount[5];
		account[0]= new BankAccount("Pat","1234",100); 
		account[1] =new BankAccount("John","1235",200);
		account[2] =new BankAccount("Sue","1236",300);
		account[3] =new BankAccount("Su","1265",400);
		account[4] =new BankAccount("Sean","1367",500);
		
		System.out.println(" Welcome to The bank of Colaiste Dhulaigh");
		System.out.println(" Please enter your account pin");
		userPin=input.next();
		for(int i=0;i<account.length;i++){
			if(userPin.equals(account[i].getAccountPin())){
				System.out.println(" Correct");
			}// end if
			else{
				System.out.println(" INCorrect");
			}
		}//end for
			
	}//end main
}//end class