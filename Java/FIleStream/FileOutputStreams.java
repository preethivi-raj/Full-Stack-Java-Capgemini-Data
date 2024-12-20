package FIleStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;


public class FileOutputStreams {
    public static void main(String[] args) {
          
        try
         {
        	String filePath = "C:\\Users\\PM103\\Downloads\\output.txt";        
            String data = "Hi , Ennoda name Preethiviraj , na tamilnadu la irudhu varugiren.";
            
        	FileOutputStream fos = new FileOutputStream(filePath); 
        	FilterOutputStream filterOut = new BufferedOutputStream(fos);
            
            byte[] byteData = data.getBytes();
                       
            filterOut.write(byteData);
            
            System.out.println("Data written");
            
            filterOut.close();
            
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
