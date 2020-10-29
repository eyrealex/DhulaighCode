package inheritance1;

public class Box {//start class
	private int height, width, length;
	
	public Box() {}//end empty constructor
	
	public Box(int height, int width, int length) {
		this.height=height;
		this.width=width;
		this.length=length;
	}//end full constructor

	public int getHeight() {
		return height;
	}//end get height



	public int getWidth() {
		return width;
	}//end get width



	public int getLength() {
		return length;
	}//end get length



	public void setHeight(int height) {
		this.height = height;
	}//end set height



	public void setWidth(int width) {
		this.width = width;
	}//end set width



	public void setLength(int length) {
		this.length = length;
	}//end set length

	
	//************methods************
	public int calVolume() {
		return height*width*length;
	}//end calVolume
	
}//end class
