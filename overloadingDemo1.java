    
//method overloading

public class overloadingDemo1
{
	static double max(double a,double b)
	{
		return a>b?a:b;
	}
	static int max(int a,int b)
	{
		return a>b?a:b;
	}
	static char max(char a,char b)
	{
		return a>b?a:b;
	}

	public static void main(String[] args) 
	{
	    System.out.println(max(4,8));
	    System.out.println(max(4.7,8.9));
	    System.out.println(max('e','p'));
	}

}
