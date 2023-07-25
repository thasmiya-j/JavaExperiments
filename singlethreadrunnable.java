
class Single implements Runnable
{
	public void run()
	{
		for(int i =0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}
public class SingleThreadRunnable {

	public static void main(String[] args) {
		Single s =new Single();
		Thread t =new Thread();
		t.start();
		

	}

}
