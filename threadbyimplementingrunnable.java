package practice;
class B implements Runnable
{
	public void run()
	{
	try
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println("my child thread"+i);
			
		}
	}
	catch(InterruptedException e)
	{
		
	}
		
	}
	}
public class ThreadByImplementingRunnable  {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		B r = new B();
		
		Thread t = new Thread(r);
		t.start();
		
		for (int i=1;i<=5;i++)
		{
			System.out.println("main thread"+i);
			
		}
	}
}
