
import java.util.Scanner;
public class relational //>,<,==,>=,<=
{
	
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			boolean c,d,e,f,g,h;
		
			
			System.out.println("enter  two values :");
			
			Scanner obj = new Scanner(System.in);
			
			int a = obj.nextInt();
			
			int b  = obj.nextInt();
			
			c = a<b;
			d = a>b;
			e = a<=b;
			f = a>=b;
			g = a==b;
			h= a!=b;
			
			System.out.println( c+ "\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+h);
			
			
			
			

		}
}
