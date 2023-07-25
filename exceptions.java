package practice;

import java.io.*; //file handling
import java.util.Scanner;
 //if there is no error in the try block it will execute everything in the try block and discard all catch blocks else if the eeror is thrown the ctch block ill be executed
public class exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=0;
		
		int C=0;
		try  //for one try block we can give multiple catch blocks
        {
		  int arr[]=null; //it'll read this 1st and check the catch block which matches
		  
		 // System.out.println(arr[1]);
		  
		  C=a/b;//throw  (exception is being thrown here)
		  
		  System.out.println("try block");//this will not be executed as the error has beeen thrown in the previous line it will start to check the try block
		  
		  throw new NullPointeErxception("demo");//custom exception (we will throw the custom exception by our own)
		}
		catch(ArithmeticException e)//we have to create a obj for exception class(coz all thrown exceptions r exception class obj's)
		{
			System.out.println("Arithmetic exception has occured");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer exception has occured ");
		}
		catch(Exception e)  //for common exceptions (we must not give this @top)
		{
			System.out.println("error occured ");
		}
		finally //error present or not present these codes will be executed
		{
			System.out.println("this gets printed no matter what");//clean up & to close resource statements , can be kept inside finally
		}
		
		//compiler identified exceptions are called (checked exceptions) 
		
		File file = new File("abc.txt");  //file obj to process file we have to create file i/o stream
		try {
			FileInputStream fs = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//this will print the details of the error (why it occures)
			
		}//we have to give file(obj) as parameter then only we can process the content of the file
		
		System.out.println(C);
		System.out.println("end of the program");
		
	/**	Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println(i);
		
		scanner.close();**/ //we must close the resource when ever we use it insead we can give inside a try block(it'ii automattically close the block
		
        int i = 0;
        try(Scanner scanner = new Scanner(System.in))
        {
        	i = scanner.nextInt();
        }
		
        System.out.println(i);
	}

}
