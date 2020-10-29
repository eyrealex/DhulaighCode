package collections;

import java.util.ArrayList;
public class ArrayListEg1 {
	static ArrayList<String> list = new ArrayList<>();
	public static void main(String[] args) {
		list.add("C");
		list.add("A");
		list.add("B");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		//print out contents of list using for loop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}//end for
		System.out.println(list);
		list.sort(null);;
		list.remove("A");
		System.out.println(list);
		list.add("W");
		System.out.println(list);
		
	}//end main

}//end class