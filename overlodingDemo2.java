
//write overload methods to find average of 2 or 3 num

public class overloadingDemo2 
{
   static int avg(int a ,int b)
   {
	   return(a+b)/2;
   }
   static int avg(int a,int b,int c)
   {
	   return(a+b+c)/3;
   }
	
	public static void main(String[] args) 
	{
		System.out.println(avg(4,8));
	    System.out.println(avg (4,8,5));
	}
}
