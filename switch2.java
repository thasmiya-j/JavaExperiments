package exp1;
import java.util.Scanner;
public class Switch_ {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a ,b;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a:");
		a = obj.nextInt();
		System.out.println("enter b:");
		b = obj.nextInt();
		char operator;
		System.out.println("enter the operators +,-,*,/,:");
		operator = obj.next().charAt(0);
		
		
		switch(operator) {
		
		case '+' :
			System.out.println(a+ "+" +b+ "=" +(a+b));
            break;
		case '-':
			System.out.println(a+ "-" +b+ "=" +(a-b));
            break;
		case '*' :
			System.out.println(a+ "*" +b+ "=" +(a*b));
            break;
		case '/' :
			System.out.println(a+ "/" +b+ "=" +(a/b));
            break;
		case '%' :
			System.out.println(a+ "%" +b+ "=" +(a%b));
            break;   
        default:
        	 System.out.println("enter valid operation");
        	 break;
		}
		
		

	}

}
