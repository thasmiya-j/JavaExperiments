package files;
import java.util.Scanner;

public class read_characters 
{

	public static void main(String[] args)
	{
		char ch;
		System.out.println("enter the character:");
		Scanner r =new Scanner(System.in);
		ch=r.next().charAt(0); //it is a method of string class as we r going to write single char ,single char will be in 0th index of a string
		//next (scanners method)which will i/p the str  r -referrnce
		System.out.println("The character is:"+ch);

	}

}
