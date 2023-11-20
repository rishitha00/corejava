package oopsdemo;

public class Traniee {
	//attributes
	private int id;
	private String name,tech;
	private double stipend;
	//constructor
	public Traniee() { //right click > source > generate constructor from super class > generate
		this.id=555;
		this.name="Rob";
		this.tech="java";
		this.stipend=6000;
		
	}
	// source > generate constructor using fields
	
	public Traniee(int id, String name, String tech, double stipend) {
		
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}
	
	void display() {
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
		
	}
	
	
	

}
