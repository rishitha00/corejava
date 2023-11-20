package oopsdemo;
// java program to implement OOP
public class StudentTest {

	public static void main(String[] args) {
		// create a object to the student class
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		//Invoke methods of student class using period(.) operator
		
		s1.input();
		float total=s1.calculate(); //invokes method and return value
		s1.display();
		System.out.println("Total display from main :"+total);
		
		s2.input();
		float total2=s2.calculate(); //invokes method and return value
		s2.display();
		System.out.println("Total display from main :"+total2);
		
		s3.input();
		float total3=s3.calculate(); //invokes method and return value
		s3.display();
		System.out.println("Total display from main :"+total3);
		
		
		

	}

}
