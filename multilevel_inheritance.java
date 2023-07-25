//multilevel inheritance

import java.util.*;
class A
{
	int n = 120;
	void display()
	{
		System.out.println("A");
	}
}
class B extends A
{
	int m = 5;
	void show()
	{
		System.out.println("B");
	}
	
}
class C extends B
{
	int t = 5;
	void disp()
	{
		System.out.println("C");
	}
	
}
public class multilevel_inheretance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.disp();
		c.show();
		c.display();

	}

}
