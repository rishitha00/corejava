package iodemo;

import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		
		try {
			//create writer object in append mode - True
			FileWriter writer=new FileWriter("c:/demo/names.txt",true);
			// true is the append 
			// improves efficiency wile writing data to the file
			BufferedWriter bwr=new BufferedWriter(writer);
			bwr.write("\nrosh"); // remove true -- wipes out the data which was already written
			bwr.write("\nMary");
			bwr.write("\nsiya");
			System.out.println("data written");
			bwr.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
			}
		

	}

}
