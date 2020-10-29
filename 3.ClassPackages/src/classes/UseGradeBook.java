package classes;

public class UseGradeBook {
	private static int[] arrayGrades= {45,65,78,76,33,44,55,87,13,47};

	public static void main(String[] args) {
		GradeBook result = new GradeBook("Computer Science 2", arrayGrades);
		
		result.printResults();
		

	}//end main

}//end class
