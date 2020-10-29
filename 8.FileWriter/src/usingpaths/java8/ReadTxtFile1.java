package usingpaths.java8;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadTxtFile1 {//start class
	private static Scanner input;
	static int accountPin;
	static int accountBalance;
	static String accountName;

	public static void main(String[] args) throws IOException {
		input = new Scanner(Paths.get("bankaccount.txt"));
		System.out.println("Name\tPin\tBalance");
			while(input.hasNext()) {//while there is still text
				accountName=input.next();
				accountPin=input.nextInt();
				accountBalance=input.nextInt();
				System.out.println(accountName+"\t"+accountPin+"\t"+accountBalance);
			}//end while
			

	}//end main

}//end class
