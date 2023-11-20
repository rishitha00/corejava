package oopsdemo3;

import com.ey.training.microsoft.*;
import com.ey.traning.oracle.*;

//demonstrate use of packages
public class SoftwareList {

	public static void main(String[] args) {
		
		OperatingSysytem os1=new OperatingSysytem();
		os1.listSoftware();
		System.out.println("************");
		Database d1 = new Database();
		d1.printSoftware();
		
		
	}

}
