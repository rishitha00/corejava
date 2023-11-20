package oopsdemo3;

public class Rectangle implements Shape {
	
	private double width;
	private double height;
	
	

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		System.out.println("Drawing Rectangle");
		
	}

	public double getArea() {
		return this.height*this.width;
		
	}
	

}
