package basicdemo;

public class OddEvenDisplay {

	public static void main(String[] args) {
		int n=1;
		System.out.print("ODD");
		System.out.println("   EVEN");
		while(n<=10) {
			if (n%2 != 0){
			
			System.out.print(n+"\t");
			}
			System.out.println(n);
			n++;
		}

	}

}
