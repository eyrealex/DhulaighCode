package stage2;
//this file uses GradeBook
//this class contains the main method for the application to run
import java.util.Scanner;
public class UseGradeBook {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {//start main
		//create a GradeBook object and assign it a reference value
		GradeBook report = new GradeBook();
		
		//take user input
		System.out.print("Please enter course name: ");
		report.courseName=input.next();
		System.out.print("Please enter course grade: ");
		report.courseGrade=input.nextInt();
		
		report.displayReport();
		

	}//end main

}//end class
