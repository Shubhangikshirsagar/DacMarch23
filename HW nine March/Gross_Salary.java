class Gross_Salary{
	public static void main(String args[])
{
	double basic_sal=10000.8989009;
	double TA=5600.6778;
	double DA=14%(basic_sal);
	double PA=7000.3443534546;
	double TD=1.76%(DA);
	double gross_sal;
	
	gross_sal=(basic_sal+TA+DA+PA-TD);
	System.out.println(gross_sal);
}
}