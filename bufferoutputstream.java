package files;
import java.util.Scanner;
import java.io.*;
public class buffered_output_stream {

	public static void main(String[] args) throws Exception
	{
		FileOutputStream fout =new FileOutputStream("C:\\Users\\Tasmiya\\Documents\\file\\buffered_output.txt" );
		BufferedOutputStream bout =new BufferedOutputStream(fout);
		String s ="thasmiya";
		byte b[]=s.getBytes();
		bout.write(b);
		
		bout.close();
		fout.close();
		System.out.print("success");
		
		

	}

}
