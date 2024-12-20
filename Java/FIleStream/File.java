package FIleStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class File {

	public static void main(String[] args) {
		
		try {
			String filePath = "C:\\Users\\PM103\\Downloads\\Sample.txt.txt";
			FileInputStream fis = new FileInputStream(filePath);
			
			FilterInputStream filter = new BufferedInputStream(fis);
			
			int availableBytes = filter.available();
			
			System.out.println("Initially ,Available bytes  :" + availableBytes);
			
			filter.read();
			filter.read();
			filter.read();
			
			int available = filter.available();
			
			System.out.println("Available bytes after :" + available);
			filter.close();

		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
