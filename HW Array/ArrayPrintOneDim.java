import java.util.Scanner;
class Array1
{
	//int a=0;
	void Take_Elements( int arr[])
	{
		for(int i=0;i<5;i++)
		{ 
	       Scanner sc=new Scanner(System.in);
			System.out.println("array Elements are");
			  arr[i]=sc.nextInt();
		}
	}
	void Display_Elements(int arr[])
	{
		for(int a:arr)
		{
			System.out.println(a);
			
		}
	}
}

class ArrayPrintOneDim
{
	public static void main(String args[])
	{
		
		 Array1 a1=new Array1();
		 int arr[] = new int[5];
		 a1.Take_Elements(arr);
		 a1.Display_Elements(arr);
	}
}
/*

import java.util.Scanner;
class Array1
{
	Scanner sc=new Scanner(System.in);
	void get_Array(int arr [])//array as a argument
	{
		System.out.println("Enter Array Elements");
	     for(int i=0; i<arr.length; i++)
		 {
			 arr[i]=sc.nextInt();
		 }
	}
	void display_Array(int[] arr)
    {
		System.out.println("Array Elements are");
		/*
	     for(int i=0; i<arr.length; i++){
			 System.out.print(arr[i]+" ");
			  }*/
			  /*for(int a:arr)//for each loop
				  System.out.print(a);
	}
}
class ArrayPrintOneDim{
	public static void main(String args[])
	{
		
		//Scanner sc=new Scanner(System.in);
		System.out.println("Declare Array Size");
		//int arr[]=new int[sc.nextInt()];array size is also taken by user
		int arr[]=new int[5];
		Array1 a=new Array1();//object created to acces from array1 class
		a.get_Array(arr);
		a.display_Array(arr);
	}
}
*/