package basicdemo;

import java.util.Scanner;

class Area {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		float a,r; //variable declaration
		final float PI = 3.14f; //constant, constant names should be upper case
		System.out.println("Enter radius of a circle :");
		r = s.nextFloat();
		a = PI*r*r;
		System.out.println("The area of a circle is"+a);
		System.out.print("The Area of circle is :");
		System.out.format("%.2f",a);
		s.close();
		
	}

}
