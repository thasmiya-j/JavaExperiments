package exp1;
class box
{
     int length;//instance variables
     int breath;
	 int height;
	 
	 box(int l,int b,int h)//constructor(a method called in its class name itself)
	 {
			 length = l;
			 breath = b;
			height = h;
			 
	 }
	 
	 void setDim(int l,int b,int h)
	 {
		length = l;
		breath = b;
		height = h;
		 
	 }
	 
	 int volume()
	 {
		return length*breath*height;
	 }
	
}

	
public class classDemo
{
	public static void main(String[]args)
	{
		box blackbox;
		blackbox = new box(4,8,6);//to give parameters inside it u need to create a constructor
		
		//blackbox.setDim(2,4,6);//we use this to change the parameters
		System.out.println("black boc vol is"+blackbox.volume());
	/*	blackbox.length = 2;
		blackbox.breath = 8;
		blackbox.height = 6;
		
		System.out.println(blackbox.volume() );//invoking method */
	}
	}


