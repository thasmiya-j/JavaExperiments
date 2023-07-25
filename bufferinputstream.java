package files;
import java.io.*;
public class buffered_input_stream {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = new FileInputStream("C:\\Users\\Tasmiya\\Documents\\file\\buffered_output.txt" );
		BufferedInputStream bin =new BufferedInputStream(fin);
		int ch;
		while((ch=bin.read())!=-1) 
		{
			System.out.println((char)ch);
			
		}
		bin.close();
		fin.close();
		

	}

}
