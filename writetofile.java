package practice;

import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {

	public static void main(String[] args) 
	{
		
	 try
	 {
		 FileWriter fwrite = new FileWriter("C:\\Users\\Tasmiya\\Documents\\file\\New _Text_ Document.txt");
		 // writing the content into the FileOperationExample.txt file
		 fwrite.write("A named location used to store related information is referred to as a File.");
		 // Closing the stream
		 fwrite.close();
		 System.out.println("Content is successfully wrote to the file.");
	 }
	 catch (Exception e)
	 {
		 System.out.println("Unexpected error occurred");
		 e.printStackTrace();
	 }
	}
		

	}


