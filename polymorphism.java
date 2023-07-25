package university_lab;
//set 5 
import java.util.*;
class Shape
{
	 void draw()
	 {
		System.out.println("drawing ") ;
	 }
	 void erase()
	 {
		 System.out.println("erasing ") ;
	 }
	
}
 class circle  extends Shape
{
	 void draw()
	 {
		System.out.println("drawing circle") ;
	 }
	 void erase()
	 {
		 System.out.println("erasing circle") ;
	 }
	
}
 class triangle extends Shape
 {
	 void draw()
	 {
		 System.out.println("drawing triangle") ;
	 }
	 void erase()
	 {
		 System.out.println("erasing triangle") ;
	 }
	 
 }
 class square extends Shape
 {
	 void draw()
	 {
		 System.out.println("drawing square") ; 
	 }
	 void erase()
	 {
		 System.out.println("erasing square") ;
	 }
	 
 }

public class Polymorphism {

	public static void main(String[] args) 
	{
		Shape s;
		s = new circle();
		s.draw();
		s.erase();
		s = new triangle();
		s.draw();
		s.erase();
		s = new square();
		s.draw();
		s.erase();
		
		

	}

}
