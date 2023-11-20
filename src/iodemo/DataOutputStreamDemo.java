package iodemo;

import java.io.*;

//dataoutput stream class allows to write primitive data types
public class DataOutputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("c:/demo/file.txt");
			DataOutputStream dout=new DataOutputStream(fos);
			
			dout.writeDouble(2000.00);
			dout.writeInt(55);
			dout.writeBoolean(true);
			dout.writeChar('D');
			System.out.println("Binary data written ");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		// Read binary data
		try {
			FileInputStream fis=new FileInputStream("c:/demo/file.txt");
			DataInputStream din=new DataInputStream(fis);
			
			double a=din.readDouble();
			int b=din.readInt();
			boolean c=din.readBoolean();
			char d=din.readChar();
			System.out.println("Values:"+a+" "+b+" "+c+" "+d);
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
