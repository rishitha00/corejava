package basicdemo;

import java.util.Scanner;

/*
 * program to find greatest of 3 numbers using if - else if - else
 */
public class Greatest3 {

	public static void main(String[] args) {
		

		int a,b,c;
		Scanner scan=new Scanner(System.in);
		
				
		System.out.println("Enter 3 NUmbers :");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		scan.close();
		// if else condition
		if(a>b && a>c) {
			System.out.println(a+" is Greatest");
		}
		else if(a==b && a==c) {
			
			System.out.println("All Numbers are equal");
		}
		else if(b>c) {
			System.out.println(b+" is Greatest");
		}
		else {
			System.out.println(c+" is Greatest");
		}
	

	}

}
