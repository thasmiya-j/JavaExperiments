
//ARITHMETIC IOERATIONS
import java.util.Scanner;
public class operators {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int c,d,e;
		float f,g;
		
		System.out.println("enter  two values :");
		
		Scanner obj = new Scanner(System.in);
		
		int a = obj.nextInt();
		
		int b  = obj.nextInt();
		
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		g = a % b;
		
		System.out.println( c+ "\n "+d+" \n"+e+" \n"+f+" \n"+g+" ");
		

	}

}
