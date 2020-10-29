package package3;

import java.lang.reflect.Array;

import package1.BankAccount;

public class UseBankAccount {

	public static void main(String[] args) {
		BankAccount account[] = new BankAccount[5];
		account[0] = new BankAccount("Alex","1234",100);
		account[1] = new BankAccount("Conor","5678",200);
		account[2] = new BankAccount("Michael","9098",300);
		account[3] = new BankAccount("Rob","7654",400);
		account[4] = new BankAccount("Keith","3212",500);
		
		for(int i=0;i<account.length;i++) {
			account[i].bankStatement();
			
		}
		
	}//end main

}//end class
