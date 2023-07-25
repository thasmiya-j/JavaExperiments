import java.util.Scanner;
public class searchAndsort
{
	static void linearsearch(int a[] ,int x)
	{
		for(int i=0;i<a.length ; i++)
		{
			if(a[i]==x)
			{
				System.out.println("found!");
				return;
			}
		}
		System.out.println(" not found!");
	}	
	static void binarysearch(int a[] , int x)
	{
		int low =0, high = a.length-1;
		while(low <= high)
		{
			int mid = (low + high) / 2;
			
			if(a[mid]==x)
			{
				System.out.println("found!");
				return;
			}
			if(a[mid]<x)
			{
				low = mid + 1;
			}
			else
			{
				high = mid-1;
			}
		
		
	}
		System.out.println( "not found!");
	}
	static void selectionsort(int a[])
	{
		int n = a.length;
		for(int i = 0; i<n-1; i++)
		{
			
		}
	}

	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in); 
		System.out.println("$$\n enter the no of elements:");
		int arr[] = new int[inp.nextInt()];
		
		
			
		for (int i = 0;i<arr.length;i++)
		{
			System.out.println("element %d:",i+1);
			arr[i] = inp.nextInt();
			
		}
		System.out.println("\n operations:\n1-linear search\n2-binarysearch \n ur choice:");
		switch(inp.nextInt()) 
		{
		case 1:
			System.out.println("enter ur search element:");
			linearsearch(arr , inp.nextInt());
			break;
		case 2:
			System.out.println("enter ur search element:");
			selectionsort(arr);
			binarysearch(arr, inp.nextInt());
			break;	
		default:
			System.out.println("invalid choice");
		}
		inp.close();
			
		
		}
		
		 
	}


