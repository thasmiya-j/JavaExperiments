package practice;
class A extends Thread
{
	public void run() //over ride method we cant throw exceptions here
	{
		try
		{
			for (int i=1;i<=5;i++)
			{
				System.out.println("thasmiya");
				Thread.sleep(1000);
			}
			
		}
		catch(InterruptedException e)
		{
			
		}
		
	}
}

public class ExtendingThreadClass {

	public static void main(String[] args)  throws InterruptedException
	{
		// TODO Auto-generated method stub
		A a =new A();
		a.start();
		
		for (int i=1;i<=5;i++)
		{
			System.out.println("priya");
			Thread.sleep(1000);
		}
		
		

	}

}
