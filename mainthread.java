package practice;

public class MainThread
{
	public static void main(String[]args)
	{
		Thread t1 = Thread.currentThread();
		t1.setName("MainThread");
		System.out.println("name of the thread is" +t1); 
		
	}

}
