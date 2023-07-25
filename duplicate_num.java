
public class dublicate_num {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,1,4,5,5,6,6,8};
		int count = 0;
		for(int i = 0;i<a.length-1;i++)
		{
			if(a[i] == a[i+1])
			{
				
				count++;
			}
		}
		System.out.println(count);
		

	}

}
