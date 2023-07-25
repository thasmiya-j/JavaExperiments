
//inner class or nested classes
import java.util.*;
class outer
{
	int num;
	void outerdisplay()
	{
		System.out.println("outer class");
	}
	
	class inner
	{
		int x;
		void innerdisplay()
	    {
			System.out.println("inner class");
	    }
	}
}
public class inner_class
{


	public static void main(String[]args) {
		// TODO Auto-generated method stub
		outer o = new outer();
		o.num = 10;
		o.outerdisplay();
		outer.inner i = o. new inner();
		i.x = 5;
		i.innerdisplay();
		
		
		
		

	}

}
