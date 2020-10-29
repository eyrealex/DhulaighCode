package inheritance;

public class ShippingCost extends BoxWeight{
	int cost;
	
	//empty constructor
	public ShippingCost() {}//end empty constructor
		
		//constructor when five parameters are specified
		ShippingCost(int weight, int heigth, int length, int width, int cost){//constructor
			this.weight=weight;
			this.height=heigth;
			this.length=length;
			this.width=width;
			this.cost=cost;
	}//end constructor

}//end class
