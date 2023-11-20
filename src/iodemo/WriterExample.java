package iodemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * Character streams - read/write textual data using reader/writer classes of java.io package
 */
public class WriterExample {
	public static void main(String[] args) {
		
		String content="She Sells seas shells in the sea in Mumbai";
		try {
			
			Writer w=new FileWriter("c:/demo/data.txt");
			w.write(content);
			System.out.println("data written to file");
			w.close();
		}
		catch(IOException e) {
			System.out.println("ERROR OCCURRED");
			e.printStackTrace();
			
			
		}
		
		
		
	}

}
