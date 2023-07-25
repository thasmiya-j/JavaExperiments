//method overriding -wriritng same method in different way(runtime polymorphism)
class parent 
{
	void display()
	{
		System.out.println("parent method");
	}
}
class child
{
	void display()
	{
		System.out.println("child method");
	}
}
public class over_riding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c = new child();
		c.display();
		

	}

}
