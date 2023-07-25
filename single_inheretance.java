import java.util.Scanner;
class parent  //package level class (no need to write publc)
{
	int a = 10;
	void display()
	{
		System.out.println("its a parent class");
	}
}
class child extends parent
{
	int b = 20;
	void show()
	{
		System.out.println("its a child class");
	}
	
	
}
public class single_
{
	public static void main(String[]args)
	{
      child c = new child();
      System.out.println(c.b);
      c.show();
      System.out.println(c.a);
      c.display();
      
	}
}
