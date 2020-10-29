package usingpaths.java8;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadTxtFile2 {//start class
	private static Scanner input;
	static int accountPin;
	static int accountBalance;
	static String accountName;

	public static void main(String[] args) throws IOException {
		openFileMethod();
		readFileMethod();
		closeFileMethod();
	}//end main

	private static void openFileMethod() {
		try {
			input=new Scanner(Paths.get("bankaccount.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end openFileMethod

	private static void readFileMethod() {
		System.out.println("Name\tPin\tBalance");
		while(input.hasNext()) {//while there is still text
			accountName=input.next();
			accountPin=input.nextInt();
			accountBalance=input.nextInt();
			System.out.println(accountName+"\t"+accountPin+"\t"+accountBalance);
		}//end while
	}//end readFileMethod

	private static void closeFileMethod() {
		input.close();
		
	}

}//end class
