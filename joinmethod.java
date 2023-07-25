package practice;
	class C extends Thread
	{
	  public void run()
	  {

	   String name = Thread.currentThread().getName();
	  try
	  {
		for(int i=1;i<=3;i++)
		{
			System.out.println(name);
			Thread.sleep(1000);
		}
	  }
	  catch(InterruptedException e)
	  {
	  }
    }
}

public class JoinMethod {

	public static void main(String[] args)
	{
		C t1 =new C();
		C t2 =new C();
		C t3 =new C();

		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");
		
		t2.start();
		try
		{
			t2.join();
		}
		catch(InterruptedException e)
		{
			
		}
		t1.start();
		t2.start();
	}

}
