package classes;

public class GradeBook {
	String courseName;
	int[] courseGrades;

	//public GradeBook() {}// empty constructor
	
	//public GradeBook(String courseName) {
	//this.courseName=courseName;
	//}end one parameter constructor

	public GradeBook(String courseName, int[] courseGrades) {
	this.courseName=courseName;
	this.courseGrades=courseGrades;
	}//end two parameter constructor

	//************Set and get methods**************
	public String getCourseName() {
		return courseName;
	}//end getCourseName

	public int[] getCourseGrades() {
		return courseGrades;
	}//end getCourseGrades

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}//end setCourseName

	public void setCourseGrades(int[] courseGrades) {
		this.courseGrades = courseGrades;
	}//end setCourseGrades
	
	//end get and set methods
	
	
	public void printResults() {
		System.out.println("Course name: " + getCourseName());
		studentResults();
		highGrade();
		lowGrade();
		averageGrade();
		
	}//end print results

	private void studentResults() {
		System.out.println("Student\tResults:");
		for(int i =0;i<courseGrades.length;i++) {
			System.out.println("Student " +(1+i)+ ": " + courseGrades[i]);
		}//end for
	}//end studentResults

	private void highGrade() {
		int high=courseGrades[0]; //OR int high=0;
		for(int i =0;i<courseGrades.length;i++) {
			if(high<courseGrades[i]) {
				high=courseGrades[i];
			}//end if
		}//end for
		System.out.println("\nHighest grade is: " + high);
	}//end highGrade

	private void lowGrade() {
		int low=courseGrades[0]; //OR int low=100;
		for(int i =0;i<courseGrades.length;i++) {
			if(low>courseGrades[i]) {
				low=courseGrades[i];
			}//end if
		}//end for
		System.out.println("Lowest grade is: " + low);
	}//end lowGrade
	

	private void averageGrade() {
		int average=courseGrades[0]; //OR int average=0;
		int total=0;
		for(int i=0;i<courseGrades.length;i++) {
			total= total+courseGrades[i];
		}
		average = total/courseGrades.length;
		System.out.print("The average is : " + average);
	}//end averageGrade

	


}//end class
