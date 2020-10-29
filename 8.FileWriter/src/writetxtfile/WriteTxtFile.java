package writetxtfile;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTxtFile {
	static Scanner input= new Scanner(System.in);
	static String phoneNumber;
	static String contactName;

	public static void main(String[] args) throws java.io.IOException {
		//set up the output file
		PrintWriter pw = new PrintWriter (new FileWriter("writefile"));
		System.out.print("Please enter Phone Number: ");
		phoneNumber=input.next();
		System.out.print("Please enter Contact Name: ");
		contactName=input.next();
		System.out.println("Name: " + contactName + "\tNumber: " + phoneNumber);
		System.out.println("Starting printing to text file...");
		pw.println("Name: " + contactName + " <Number: " + phoneNumber);
		pw.close();
		

	}//end main

}//end class
