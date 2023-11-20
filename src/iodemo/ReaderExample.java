package iodemo;

import java.io.*;
// reader class is used to read textual data from a file

public class ReaderExample {

	public static void main(String[] args) {
		try {
			Reader reader=new FileReader("c:/demo/data.txt");
			int data=reader.read();//return unicode value of char
			while(data != -1) {
				System.out.print((char)data);//to get data in charcter format
				data=reader.read();
				
				
			}
			reader.close();
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			}
		

	}

}
