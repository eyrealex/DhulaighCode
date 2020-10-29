package inheritance;

public class BoxWeight extends Box {//start class
	int weight;
	
	//overloading methods
	public BoxWeight(){}//end empty constructor
	
	BoxWeight(int width, int height, int length, int weight){
		this.width=width;
		this.height=height;
		this.length=length;
		this.weight=weight;
	}//end constructor

}//end class
