package inheritance;
//this file is the entry point to the application
import java.util.Scanner;
public class StartApp {

	static Scanner input= new Scanner(System.in);
	public static void main(String[] args) {

		//reference call
		ShippingCost price = new ShippingCost();
		
		System.out.print("Please enter width: ");
		price.width=input.nextInt();
		
		System.out.print("Please enter height: ");
		price.height=input.nextInt();
		
		System.out.print("Please enter length: ");
		price.length=input.nextInt();
		
		System.out.print("Please enter weight: ");
		price.weight=input.nextInt();
		
		System.out.print("Please enter cost: ");
		price.cost=input.nextInt();
		
		System.out.print("\nWidth: " + price.width + "\nHeight: " + price.height + "\nLength: " + price.length + "\nWeigth: " + price.weight + "\nCost: " + price.cost);
		

	}//end main

}//end class
