		
public class method_sumofdigits
{
	static int sumofdigits(int n)
	{
		int sum=0,mod,div;
		while(n>0)
		
		{
		mod = n%10;
		sum+= mod;
		n = n/10;
		}
		
		return sum;
	}
		
		static void display()
		{
			 System.out.println("welcome!!!");
		}
		
		
		
		
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 display();
		 int dig = sumofdigits(12);
		 System.out.println("sum of dig:"+dig);
		 
		 int num = sumofdigits(852);
		 System.out.println("sum of num:"+num); 
		 
		 int a = sumofdigits(789456123);
		 System.out.println("sum of a:"+a); 
		 
			
		

	}

}
