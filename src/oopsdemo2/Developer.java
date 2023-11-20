package oopsdemo2;
// child class - single inheritance
public class Developer extends Employee {
	
	private String technology;
	
	public Developer(int empId, String name, String technology) {
		super(empId, name);
		this.technology=technology;
		
	}
	
	void print() {
		System.out.println("Tech Stack :"+technology);
	}

	
	
	
	

}
