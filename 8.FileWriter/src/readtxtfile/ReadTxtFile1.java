package readtxtfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadTxtFile1 {//start class
	private static Scanner input;

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Reading a text file");
		input = new Scanner(new FileReader("helloworld.txt"));
		String text = input.nextLine();
		System.out.println(text);
	}//end main

}//end class
