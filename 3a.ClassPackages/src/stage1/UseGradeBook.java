package stage1;
//this file uses GradeBook
//this class contains the main method for the application to run

public class UseGradeBook {

	public static void main(String[] args) {//start main
		//create a GradeBook object and assign it a reference value
		GradeBook report = new GradeBook();
		
		System.out.println("Testing printout");
		report.displayReport();
		report.pointsCalculator();
		

	}//end main

}//end class
