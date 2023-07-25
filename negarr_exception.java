package university_lab;
//set 5 
//6a
public class NegTest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
			try
			{
			int a[] = new int[-2];
			
			
			
			}
			catch(NegativeArraySizeException e)
			{
			System.out.println(" generated exception : " + e);
			}
			System.out.println(" After the try block");
			}
			

	}


