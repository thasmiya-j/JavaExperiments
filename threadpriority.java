package practice;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(+i);
		}
		System.out.println("exit from A");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println(+j);
		}
		System.out.println("exit from B");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println(+k);
		}
		System.out.println("exit from C");
	}
}


public class ThreadPriority 
{
	public static void main(String[]args) 
	{
		A a =new A();
		a.setPriority(Thread.MIN_PRIORITY);
		B b =new B();
		b.setPriority(6);
		
		C c =new C();
		c.setPriority(Thread.MAX_PRIORITY);
		a.start();
		b.start();
		c.start();
		try
		{
			a.join();
			b.join();
			c.join();
			
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Exception occured");
		}
		
		}
	}

                                                                      




















































