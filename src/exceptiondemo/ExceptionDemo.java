package exceptiondemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		String languages[]= {"c","c++","java","perl","python"};
		String a=null;
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(languages[i]);
			}
			System.out.println(a.length());
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
			
	}
}
