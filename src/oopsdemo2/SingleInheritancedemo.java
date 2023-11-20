package oopsdemo2;

public class SingleInheritancedemo {

	public static void main(String[] args) {
		Developer d1 = new Developer(101,"james Gosling","JDBC");
		Developer d2 = new Developer(102,"Rob Gosling","JDBC");
		
		d1.display(); //child class object invokes parent class method
		d1.print();
		
		d2.display();
		d2.print();
		

	}

}
