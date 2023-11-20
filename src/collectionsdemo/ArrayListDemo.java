package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("James");
		names.add("Andy");
		names.add("Micheal");
		names.add("jim");
		names.add("Robert");
		names.add("Robert");
		System.out.println(names);
		
		names.add("head");
		names.add(3,"Gosling");
		names.remove(0);
		names.set(1, "java");
		
		System.out.println("Display arraylist contents using enhanced for loop");
		for(String i:names) {
			System.out.println(i);
		}
		
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(999.55);
		marks.add(500.15);
		marks.add(234.10);
		marks.add(450.20);
		marks.add(100.99);
		
		System.out.println("The length of array is :"+marks.size());
		System.out.println("The elemnt at position 3 is "+marks.get(3));
		System.out.println("The position of 100.99"+marks.indexOf(100.99));
		
		//collections is a utility class
		Collections.sort(marks);
		System.out.println(marks);
		
	}

}
