package inheritance;

public class Box {//start class
	int height, width, length;
	
	//methods
	public void calVolume() {
		int volume=height*width*length;
		System.out.println("The volume is " + volume);
	}//end calVolume
}//end class
