import java.util.Scanner;
public class elifdemo_ {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int marks ;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter ur marks:");
		marks = obj.nextInt();
		if(marks>100 && marks<90)
		{
			System.out.println("GRADE A");
		}
		else if(marks>90 && marks<80)
		{
			System.out.println("GRADE B");
		}
		else if(marks>80 && marks <70)
		{
			System.out.println("GRADE C");
		}
		else if(marks>70 && marks <60)
		{
			System.out.println("GRADE D");
		}
		else if(marks>60 && marks <50)
	    {
			System.out.println("GRADE E");
		}
			
	
		else 
		{
			System.out.println("FAIL");
		}
		
		
		

	}

}
