import java.util.*;
class thread{
	
}
class single extends thread 
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
		
}
public class singlethread {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single t =new Single();
		t.start();

	}

}
