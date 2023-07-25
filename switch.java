import java.util.Scanner;

public class Switch_vowel_or_consonant 
{
	public static void main(String args[])
	{
		
		Scanner obj = new Scanner(System.in);
		while(true)
		{
		System.out.println("enter ur chr:");
		char ch = obj.next().charAt(0);
		
		switch(ch)
		{
		case 'a' :
			
		case 'e':
			
		case 'i':
			
		case 'o' :
			
		case 'u':
			System.out.println(	ch+ "is a vowel");
			break;
		
		default :
			System.out.println(	ch+ "is a consonant");
			
		}
		}
		

    }
}
