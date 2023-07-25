package practice;

public class Illegal_thread extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
	}

	public static void main(String[] args)
	{
		Illegal_thread t1 = new Illegal_thread();
		t1.start();
		t1.start();
		//when we started next time same thread obj.it complied successfully but displayed runtime error

	}

}
