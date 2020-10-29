package stage1;

//this class contains no main method
//we need another class(UseGradeBook) which contains the main.
//this class is a blueprint for a grade book which has student info
public class GradeBook {
	//global variables used in future constructors
	String courseName;
	int courseGrade;
	
	//global variables used in several methods
	int points; //this value is calculated using if statements by a method
	
	
	public GradeBook() {}//empty constructor
	
	//display method
	public void displayReport() {
		System.out.println("Course Name: " + courseName);
		System.out.println("Course Grade: " + courseName);
		
	}//end display method
	
	//points calculator
	public void pointsCalculator() {
		if(courseGrade>=85) {
			points = 100;
		}//end if 
		else if(courseGrade>=65) {
			points = 70;
		}//end else if 
		else if(courseGrade>=45){
			points = 50;
		}//end else if
		else {
			points = 0;
		}//end else
		System.out.print("Points: " + points);
	}//end pointsCalculator

}//end class
