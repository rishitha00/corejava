package basicdemo;
/*
 * Program to find sum and average of 3 num
 * using scanner input
 */

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		
		// Variable declaration
		int a,b,c,sum;
		float avg, marks;
		String name;
		Scanner s = new Scanner(System.in);
		
		//input from user
		System.out.println("Enter your name :");
		name = s.next(); //string input
		System.out.println("Enter your marks");
		marks = s.nextFloat(); //float input
		System.out.println("Enter 3 numbers :");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		//process
		sum = a+b+c;
		avg = (float) sum/3;
		
		//output
		System.out.println("The sum of 3 no :"+sum);
		System.out.println("Average of 3 no :"+avg);
		System.out.println("Hello "+name+" you scored "+marks+" marks");
		s.close();

	}
	


}
