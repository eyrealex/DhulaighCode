package switchstatements;
import java.util.Scanner;

public class SwitchArray { //start class
	//global variables
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please choose one of the following options: ");
		System.out.println("1.Find Sum\n2.Print out array"
				+ "\n3.How many 2's in Array\n4.Get Average\n5.Quit");
		int option = input.nextInt();
		//switch statement to choose option
		switch(option) {
			case 1: System.out.println(ArrayMethods.sumMethod());break;
			case 2: ArrayMethods.printMethod();break;
			case 3: ArrayMethods.findMethod();break;
			case 4: ArrayMethods.averageMethod();break;
			case 5:
			default: ArrayMethods.returnMethod();
		}//end switch

	}//end main

	

}//end class
