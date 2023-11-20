package oopsdemo;

public class TraineeTest {

	public static void main(String[] args) {
		
		// Invokes parameterized constructor
		
		Traniee t1=new Traniee(111,"james","java",7000);
		t1.display();
		
		Traniee t2=new Traniee(112,"jack","java",8000);
		t2.display();
		
		// Invokes Implicit constructor
		
		Traniee t3=new Traniee();
		t3.display();
		
		
		

	}

}
