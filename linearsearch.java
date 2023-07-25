package exp1;

public class Search {
	static int linearsearch(int array[],int x)
	{ 
		int n,i;
		n = array.length;
		//traversing through array sequencially
		for(i=0;i<=array.length;i++)
		{
			array[i]=x;
			return i;
		}
		return -1;
		
		
	}
	public static void main(String[] args)
	{
		int array[]= {3,4,5,6};
		int x = 4;
		int result = linearsearch(array,x);

		if (result==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element found");
			
		}
	}
	
		
         

	}
