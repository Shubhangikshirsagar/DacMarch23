class AreaTricirsqrect{
     int side1 =3;
	 int side2=3;
	 final double pi=3.14;
	 
	void display1()
	{
		double area1=(pi*side1*side1);
	    System.out.println("area of Circle=" +(area1));	
	}
	
	void display2()
	{ 
	   double area2=0.5*(side1*side2);
	   System.out.println("area of Triangle =" +(area2));	
	}
	
	void display3()
	{
		double area3=side1 *side2;
	   System.out.println( "area of Rectangle =" +(area3));	
	}
	
	void display4()
	{ 
	   double area4=side1*side2;
	  if (side1==side2)
	   System.out.println("area of Square =" +(area4));	
	   else
		   System.out.println("not a square");	
	}

	public static void main(String args[])
	{  
      
	  AreaTricirsqrect a1 =new AreaTricirsqrect();
	  a1.display1();
	  AreaTricirsqrect a2 =new AreaTricirsqrect();
	  a2.display2();
	  AreaTricirsqrect a3 =new AreaTricirsqrect();
       a3.display3();
	  AreaTricirsqrect a4 =new AreaTricirsqrect();
	   a4.display4();
	}
}