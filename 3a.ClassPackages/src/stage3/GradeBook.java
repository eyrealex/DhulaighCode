package stage3;
//this class contains no main method (so it cannot run)
//we need a another class(UseGradeBook) which contains the main method
//this class is a blueprint for a grade book which has student info

public class GradeBook {//start class
	//global variables will be used in future constructors/get-set methods
	private String courseName;
	private int courseGrade;
	//global variable used in several methods
	private int points;// this value is 'calculated'(using if statements) by a method
	private int Points;
	
    //****************** CONSTRUCTORS*********************
	public GradeBook() {}//empty constructor
	
	// constructor with 2 parameters
	public GradeBook(String courseName, int courseGrade) {
		this.setCourseName(courseName);
		this.setCourseGrade(courseGrade);	
	}// end constructor
    //************************ GET SET METHODS********************
	public String getCourseName() {
		return courseName;
	}// end get method

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}// end set method

	public int getCourseGrade() {
		return courseGrade;
	}// end get method

	public void setCourseGrade(int courseGrade) {
		this.courseGrade = courseGrade;
	}// end set method

	public int getPoints() {
		return points;
	}//end get method

	public void setPoints(int points) {
		this.points = points;
	}// end set method

	//******************** OTHER METHODS***************
	// display method
	public void displayReport(){
		System.out.println("Course Name::"+getCourseName());
		System.out.println("Course Grade::"+getCourseGrade());
		pointsCalculator();
	}// end display method
	// points converter
	//points calculator
		public void pointsCalculator() {
			if(getCourseGrade()>=90) {
				Points = 100;
			}//end if 
			else if(getCourseGrade()>=80) {
				setPoints = 88;
			}//end else if 
			else if(getCourseGrade()>=70){
				setPoints = 77;
			}//end else if
			else if(getCourseGrade()>=60){
				setPoints = 66;
			}//end else if
			else if(getCourseGrade()>=50){
				setPoints = 56;
			}//end else if
			else if(getCourseGrade()>=40){
				setPoints = 46;
			}//end else if
			else if(getCourseGrade()>=30){
				setPoints = 36;
			}//end else if
			else {
				setPoints = 0;
			}//end else
			System.out.print("Points: " + getPoints());
		}//end pointsCalculator
}//end class
