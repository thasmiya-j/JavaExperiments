package exp1;

public class student {
	int rollno;
	String  name;
	
	void insertRecord(int r,String n)//method
	{
	rollno = r;
	name = n;
	}
	
	void displayInformation()//method
	{
		System.out.println(rollno+ " " +name);
		
	}
	
	public static void main(String[] args) {
		student s1 = new student();
		student s2= new student ();
		
		s1.insertRecord(21 ,"abi");
		s2.insertRecord(34 ,"iniyal");
		
		s1.displayInformation();
		s2.displayInformation();
		
		

	}

}
