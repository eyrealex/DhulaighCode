package package2;

import package1.BankAccount;

public class UseBankAccount {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("Alex","1234",100);
		BankAccount account2 = new BankAccount("Conor","5678",200);
		BankAccount account3 = new BankAccount("Michael","9098",300);
		BankAccount account4 = new BankAccount("Rob","7654",400);
		BankAccount account5 = new BankAccount("Keith","3212",500);
		account1.bankStatement();
		account2.bankStatement();
		account3.bankStatement();
		account4.bankStatement();
		account5.bankStatement();
	}//end main

}//end class
