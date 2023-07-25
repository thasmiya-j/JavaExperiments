
//set5
//13

import java.util.Scanner;
public class Main 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the student: ");
		
		 String name = sc.next();
		
		System.out.println("Enter total number of according days present: ");
		
		 int days = sc.nextInt();
		 
		double attendance_perc=(100*days)/7.0;
		
		int marks=0;
		
		if (attendance_perc>=90)
		{
		    marks=5;
		}
		else if(attendance_perc>=80)
		{
		    marks=4;
		}
		System.out.println("Name: "+name);
		System.out.println("Number of days: "+days);
		System.out.println("Marks: "+marks);
		
		

	}

}

