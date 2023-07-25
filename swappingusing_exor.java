
public class swapping_using_exor {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a = 5 ,b = 10 ,c ,d,temp;
		c = (a^b)^a;
		d = (a^b)^b;
		temp=c;                                                        
		c= d;
		d=c;
		c= temp;
		System.out.println(c);
		System.out.println(d);
		

	}

}
