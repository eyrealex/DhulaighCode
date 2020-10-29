package inheritance1;

public class BoxWeight extends Box {//start class
	private int weight;
	
	//overloading methods
	public BoxWeight(){}//end empty constructor
	
	BoxWeight(int height, int width, int length, int weight){
		super(height, width, length);
		this.weight=weight;
		
	}//end constructor

	public int getWeight() {
		return weight;
	}//end get weight

	public void setWeight(int weight) {
		this.weight = weight;
	}//end set weight
	
	//method to calculate volume
	public int calMass() {
	return weight/10;	
	}

}//end class
