package university_lab;
//set5
//10

class Thread1 extends Thread {

    public void run() {
        System.out.println("Thread1: Java");
        System.out.println("Thread1: is ");
        System.out.println("Thread1: hot ");
        System.out.println("Thread1: aromatic ");
        System.out.println("Thread1: invigorating ");
       
    }
}

class Thread2 extends Thread {

    public void run() {
        System.out.println("Thread2 Java");
        System.out.println("Thread2: is");
        System.out.println("Thread2: hot ");
        System.out.println("Thread2: aromatic ");
        System.out.println("Thread2:  invigorating");
       
        
}
class Thread3 extends Thread
{
public void run()
{
System.out.print("Thread3");
try
        {
sleep(1000);
}
catch(Exception e)
{
}

System.out.print(" Running");
}
}


public class ThreadDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Thread1 obj1 = new Thread1();
		obj1.start();
		Thread2 obj2 = new Thread2();
		obj2.start();
		

	}

}
