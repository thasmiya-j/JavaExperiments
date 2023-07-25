package practice;
class Box
{
	int side;
	
Box(int a)	
{
	side = a;
}
void setDim(int a)	
{
	side = a;
}

int surfacearea()
{
	return 4*side*side; 
}
}



public class surfacearea_method 
{
	public static void main(String[]args)
	{
		Box cube;
		cube = new Box(2);
		
		System.out.println("\nsurface area of cube is"+cube.surfacearea());

    }
}
