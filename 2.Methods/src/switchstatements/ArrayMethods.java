package switchstatements;

public class ArrayMethods {//start class
	static int[]numbers= {2,3,4,5,3,2,2,4,42,6,1,10};
	//Methods
		public static int sumMethod() {
			int total=0;
			for(int i=0;i<numbers.length;i++) {
				total=total+numbers[i];
			}//end for
			return total;
		}//end sumMethod

		public static void printMethod() {
			for(int i=0;i<numbers.length;i++) {
				System.out.print(numbers[i] + ",");
			}//end for
		}//end printMethod

		public static void findMethod() {
			int count=0;
			for(int i=0;i<numbers.length;i++) {
				if(numbers[i]==2) {
					count++;
				}//end if
			}//end for
			System.out.println("There is " + count + " two's");
		}///end findMethod

		public static void returnMethod() {
		}//end returnMethod
		
		public static void averageMethod() {
			int average= sumMethod()/numbers.length;
			System.out.print(average);
		}//end returnMethod

}//end class
