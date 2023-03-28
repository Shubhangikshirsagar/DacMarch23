import java.util.Scanner;

class Actor{
	String name;
	String industry;
	int age;
	String Dob;
	int followers;
	String best_movie_name;
	
	void Details_of_Actor()
	{
		System.out.println("information About an actor:");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name of actor:");
		name=sc.nextLine();
		System.out.println("name="+name);
		
		System.out.println("enter industry of actor:");
		industry=sc.nextLine();
		System.out.println("industry="+industry);
		
		System.out.println("enter age of actor:");
		age=sc.nextInt();
		System.out.println("age="+age);
		
		System.out.println("enter date of birth of actor:");
		Dob=sc.nextLine();
		System.out.println("Date of birth="+Dob);
		
		System.out.println("enter number of followers  actor:");
		followers=sc.nextInt();
		System.out.println("followers="+followers);
		
		System.out.println("enter best_movie_name of actor:");
		best_movie_name=sc.nextLine();
		System.out.println("best_movie_name="+best_movie_name);	
	}
	public static void main(String args[]){
		
		Actor A1=new Actor();
		A1.Details_of_Actor();	
	}
}