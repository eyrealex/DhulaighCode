package readtxtfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadTxtFile2 {
	private static Scanner input;

	public static void main(String[] args)  {
		System.out.println("Reading a text file");
		try {
			input = new Scanner(new FileReader("helloworld.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String text = input.nextLine();
		System.out.println(text);

	}//end main

}//end class
