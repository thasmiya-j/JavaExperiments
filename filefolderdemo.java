package practice;
import java.io.File; ///all file classes are available here
//stream- sequence ofdata on the basis of java.io package(divided into - byte,character)

//folder creation

public class FileFolderDemo 
{
	public static void main(String[] args) 
	{
		File file =new File(" C:\\Users\\Tasmiya\\Desktop\\New folder\\file");
		
		boolean present = file.exists();
		
		System.out.println("Folder present: "+present);
		
		if(present==false)
			//file.mkdir(); for creating one folder
			file.mkdirs();  //for creating multiple folders including necessary parent directories
		 present = file.exists();
		 
		System.out.println("Folder present: "+present);

	}

}
