package basicdemo;

import java.util.Scanner;

/*
 * Progar to find greatest of 2 numbers
 */
public class Greatest2 {

	public static void main(String[] args) {
		
		int a,b;
		Scanner scan=new Scanner(System.in);
		
				
		System.out.println("Enter 2 NUmbers :");
		a=scan.nextInt();
		b=scan.nextInt();
		
		scan.close();
		// if else condition
		if(a > b) {
			System.out.println(a+" is Greatest");
		}
		else {
			System.out.println(b+" is Greatest");
		}
		
		
		

	}

}
