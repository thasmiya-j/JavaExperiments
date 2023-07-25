
public class foreachdemo 
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5};
		int sum = 0;
		int i;
		
		for ( i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		for (int x : arr)
		{
			sum+= x;
		}
		System.out.println("sum is "+sum);
		
		
}
    }
