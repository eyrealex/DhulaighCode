package stage3;

//This class uses GradeBook 
//this file contains the main method which is required for this
//application to run

import java.util.Scanner;//Java library class
public class UseGradeBook {// start class
	static Scanner input= new Scanner(System.in);

	public static void main(String[] args) {// start main method
		// create an GradeBook object and assign it a reference  value
		GradeBook report = new GradeBook();
		int total=0;
		
		//take user input
				for(int i=1;i<=2;i++) {
					System.out.print("Please enter course name: ");
					report.setCourseName(input.next());
					System.out.print("Please enter course grade: ");
					report.setCourseGrade(input.nextInt());
					report.displayReport();
					//do maths
					total = total+report.getPoints();
				}//end for loop
				System.out.println("Total points: " + total);
		
	}//end main method

}// end class

/*
Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

To achieve encapsulation in Java −

Declare the variables of a class as private.

Provide public setter and getter methods to modify and view the variables values.
*/