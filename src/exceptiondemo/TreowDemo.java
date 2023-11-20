package exceptiondemo;

public class TreowDemo {
	public static void hello(int a) {
		if(a==0) {
			throw new ArithmeticException("pass non zero values");
		}else {
			System.out.println("passed value is:"+a);
		}
	}
	public static void main(String[] args) {
		hello(100);
		hello(0);
		
		
	}

}
