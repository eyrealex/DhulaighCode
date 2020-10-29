package switchstatements;

import java.util.Scanner;
public class Calculator {//start class
	//global variable
	static Scanner input = new Scanner(System.in);
	static int result=0,num2,num1;
	
	public static void main(String[] args) {//main
		takeInput();
		chooseOperator();
	}//end main

	public static void chooseOperator() {
		System.out.println("Please enter one of the following: +,-,*,/");
		String operator = input.next();
		//switch
		switch(operator) {
			case "+":result = MathsCal.addMethod(num1,num2);break;
			case "-":result = MathsCal.subtractMethod(num1,num2);break;
			case "*":result = MathsCal.multiplyMthod(num1,num2);break;
			case "/":result = MathsCal.divideMethod(num1,num2);break;
			default: System.out.println("Wrong operator");break;
		}//end switch 	
		System.out.println("The answer is "+result);
	}//end chooseOperator

	public static void takeInput() {
		System.out.print("Please enter first number: ");
		num1 = input.nextInt();
		System.out.print("Please enter second number: ");
		num2 = input.nextInt();	
	}//end takeInput

}//end class
