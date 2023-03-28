import java.util.Scanner;
class Bank
{
   String bank_name;
   String branch_name;
   long ifsc;
   String opening_time;
   String closing_time;
   String address;
   
	void Bank_details()
	{
		System.out.println("information About an actor:");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Bank name");
		bank_name=sc.nextLine();
		System.out.println("Bank name is:" +(bank_name));
		
		System.out.println("Enter branch_name");
		branch_name=sc.nextLine();
		System.out.println("Branch name is:" +(branch_name));
		
		
		System.out.println("Enter IFSC");
		ifsc=sc.nextLong();
		System.out.println("  IFSC is:" +(ifsc));
		
		
		System.out.println("Enter  opening_time");
		opening_time=sc.nextLine();
		System.out.println("opening_time is:" +(opening_time));
		
		System.out.println("Enter closing_time");
		closing_time=sc.nextLine();
		System.out.println("closing_time is:" +(closing_time));
		
		System.out.println("Enter ddress");
		address=sc.nextLine();
		System.out.println("address is:" +(address));
    }
	public static void main(String args[])
	{  
        Bank b1 =new Bank();
	    b1.Bank_details();
	}
}