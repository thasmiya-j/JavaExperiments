package practice;

  interface Shape
{
	void draw();
}

 

  class circle implements Shape
 {
	public void draw() 
	{
		System.out.println("drawing circle") ;	
	}
 }
  class rectangle implements Shape
  {
	  public void draw() 
		{
			System.out.println("drawing rectangle") ;	
		}
  }
  class triangle implements Shape
  {
	  public void draw() 
		{
			System.out.println("drawing triangle") ;	
		}
  }
  class  square implements Shape
  {
	  public void draw() 
		{
			System.out.println("drawing square") ;	
		}
  }
  
	  
	
	
 public  class Interface
	{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		circle c =new circle();
		c.draw();
		rectangle r =new rectangle();
		r.draw();
		triangle t =new triangle();
		t .draw();
		square s =new square();
		s.draw();
		
		
	}

}
