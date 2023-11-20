package basicdemo;
/*
 * Program to display your name 10 times
 */
public class WhileDemo {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println(i+" James");
			i += 1; //increment loop
		}
		System.out.println("***** REVERSE LOOP");
		
		int j=10;
		while(j>=1) {
			System.out.println(j);
			j -= 1;
		}

	}

}
