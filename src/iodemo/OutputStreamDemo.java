package iodemo;

import java.io.*;
//read/write byte stream - Input stream and Output stream
public class OutputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos=new FileOutputStream("c:/demo/data1.txt");
			String text="its a sunny day";
			
			byte[] myBytes=text.getBytes();
			
			fos.write(myBytes);
			System.out.println("data written to binary file");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
