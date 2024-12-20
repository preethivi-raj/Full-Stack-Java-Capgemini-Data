package FIleStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.FileOutputStream;
import java.io.FilterInputStream;

public class DataInputStreams {

	public static void main(String[] args) {
		try {
			DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("C:\\Users\\PM103\\Downloads\\data.bin"));
			
			dataOut.writeInt(10);
			dataOut.writeChars("Vannakam Dharmapuri");
			
			System.out.println("Everything is done");
			dataOut.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
//		try {
//			DataInputStream dataIn = new DataInputStream(new FileInputStream("C:\\Users\\PM103\\Downloads\\data.bin"));
//		    
//			int data =dataIn.readInt();
//			
//			System.out.println("data: " + data);
//			dataIn.close();
//			
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
	}

}
