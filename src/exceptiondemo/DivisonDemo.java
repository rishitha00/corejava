package exceptiondemo;

import java.util.Scanner;

public class DivisonDemo {

	public static void main(String[] args) {
		int a, b, result;
		 Scanner input = new Scanner(System.in);
		 
		  System.out.println("Input two integers");
		  a = input.nextInt();
		  b = input.nextInt();
		  // enter 0
		  
		  try {
		  
			  result = a / b;  // JRE Throws Arithmetic exception
		 
			  System.out.println("Result = " + result);
		  }
		  catch(ArithmeticException e) {
			  System.out.println("Divide bt zero error - enter non -zero value");
			  System.err.println("Exception Description"+e.getMessage());
			  System.err.println("Exception  name & description :"+e.toString());
			  e.printStackTrace();
		  }
		  finally {
			  input.close();
		  }

	}

}
