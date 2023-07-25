
public class sorting_num {
	public static void main(String[] args) 
	{  
		//initializing array
		int arr[] = {8,5,4,9,2};
		int temp = 0;
		
	//displaying elements of original array
		
		System.out.println("elements of original array:");
		for(int i = 0;i<arr.length;i++) 
		{
			System.out.println(arr[i]+" ");
		}
		
	
	
	//sorting array in ascending order
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j = i+1; j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	
	System.out.println("elements of array sorting elements:");
	for(int i = 0;i<arr.length;i++) 
	{
		System.out.println(arr[i]+" ");
	}
	
	}
}
