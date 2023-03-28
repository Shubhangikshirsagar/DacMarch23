import java.util.Scanner;
class Radio{
   String Rjname;
   String Program_name;
   String Program_time;
    Double Frequency_number;
   
	void Take_Channel()
	{
		System.out.println("information About an actor:");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Rjname");
		Rjname=sc.nextLine();
		System.out.println("Rjname is:" +(Rjname));
		
		System.out.println("Enter Program_name");
		Program_name=sc.nextLine();
		System.out.println("Program_name is:" +(Program_name));
		
		System.out.println("Enter Program_time");
		Program_time=sc.nextLine();
		System.out.println("Program_time is:" +(Program_time));
		
		
		System.out.println("Enter Frequency_number");
		Frequency_number=sc.nextDouble();
	System.out.println("Frequency_number is :" +(Frequency_number));
	}
	public static void main(String args[])
	{  
       Radio R1 =new Radio();
	   
	   R1.Take_Channel();
	}
}