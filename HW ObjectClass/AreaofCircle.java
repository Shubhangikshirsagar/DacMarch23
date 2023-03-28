class AreaofCircle{
    double radius=3;
	final double pi=3.14;
	 double area=(pi*radius*radius);
	void display()
	{
	   System.out.println(area);	
	}
	public static void main(String args[])
	{  
       AreaofCircle circle=new AreaofCircle();
	   System.out.println(circle.area);	
	   circle.display();
	}
}