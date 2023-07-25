package practice;
import java.util.Scanner;

public class input_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);//saying that i need a scanner object 
		
		System.out.println("enter your name:");
		
		String name = obj.nextLine();
		
		System.out.println( "hey!" +name);
		
        
	}

}
