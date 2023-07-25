package files;

public class ThreadGroupDemo implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) 
	{
		ThreadGroupDemo runnable = new ThreadGroupDemo();
		ThreadGroup tg1 =new ThreadGroup("parent ThreadGroup");
		Thread t1 = new Thread(tg1,runnable,"one");
		t1.start();
		Thread t2 = new Thread(tg1,runnable,"one");
		t2.start();
		Thread t3 = new Thread(tg1,runnable,"one");
		t3.start();
		System.out.println("thread group name"+tg1.getName());
		tg1.list();
		

	}

}
