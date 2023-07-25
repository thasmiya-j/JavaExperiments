
//interface - what to do but not how to do

interface Ridable
{
	void ride(); 
}
class car implements Ridable
{
	public void ride()
	{
	System.out.println("you are riding a car");
	}

}
class bike implements Ridable
{
	public void ride()
	{
	System.out.println("you are riding a bike");
	}

}
class mechanic
{
	 void check(Ridable r)
	{
	System.out.println("checking");
	r.ride();
	}

}
public class interface_ 
{
	public static void main(String[]args) {
		Ridable r = new car();
		car c = new car();
		bike b = new bike();
		mechanic m = new mechanic();
		m.check(c);
		m.check(b);
	}

}
