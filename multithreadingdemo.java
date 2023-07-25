package practice;

//multithreading

class Book implements Runnable
{
	public void run() //run
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("updating Db");
			try{
				Thread.sleep(2000);
			   }
			catch(InterruptedException e)
			{
				
			}
			
		}
	}
	
}

class Num extends Thread
{
	 public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try{
				Thread.sleep(1000);
			   }
			catch(InterruptedException e)
			{
				
			}
			
		}
	}
}

public class Multithreadingdemo {

	public static void main(String[] args) throws InterruptedException //main is a thread while running it we get an error
	{
		
		//Runnable book = new Book(); //book-thread(what ever obj we create for that class is a thread
		Runnable book = () ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("updating Db");
				try{
					Thread.sleep(2000);
				   }
				catch(InterruptedException e)
				{
				}
			
		}
		Num num = new Num();
		
		Thread t1 = new Thread(book);
		
		t1.setName("book1");
		
		System.out.println(t1.getName());
		
		t1.start();
		
		//book.updateDb();
	    num.start();
	    book.start();// run    after we givin this it will go to its class to check if there a method called run
	    
	    if(book.isAlive())
	    	System.out.println("still executing");
	    
	    t1.start();//we r saying that let this complete after that execute the rest of the code
	    num.join();
	    System.out.println("bye");
		
	}
	

}
	
}
