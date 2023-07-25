package practice;

public class CreateFile 
{
	  File f =new File("C:\\Users\\Tasmiya\\Desktop\\file.txt");

	public static void main(String[] args) 
	{
		if(f.createNewFile())
		{
			System.out.println("file succesfully created !!...");
		}
		else
		{
			System.out.println("file already exists !!...");
		}
		

	}

}
