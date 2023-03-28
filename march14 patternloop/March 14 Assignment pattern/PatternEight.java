/*
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/

class  PatternEight{
	public static void main(String[]args){
		for (int i= 5; i >= 1; i--)
		    {
			for (int  j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for (int k = i; k <=5; k++)
			{
				System.out.print(k +" ");
			} 
			System.out.println();
			
		    }
}
}


/*
for(char a=65; a<70; a++)
	{
		for(char b=69;b>=a;b--)
		{
			System.out.print(" ");
		}
		for(char c=65; c<=a; c++)
		{
			System.out.print(c+ " ");
		}
		System.out.println();
	}
	
*/
/*
class StarP5 
{
	public static void main (String args [])
	{
		for(int i =1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				if(j>i)
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/
/*

class StarP7
{
	public static void main (String args [])
	{
		for(int i =1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				if(j>i)
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int k1=3;k1>=i;k1--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
*/

/*
class Star1_5{
	public static void main(String[] arg)
	{
		for(int i=1; i<10; i=i+2)
		{
			for(int j=1; j<=((10-i)/2); j++)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

*/

/*
class Pattern2{
public static void main(String args[]){
	for(int i =1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print(" ");
		}
		
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}

  /*
        *
	   **	
	  *** 
	 **** 
	***** 
*/
/*
class Pattern4{
public static void main(String args[]){
	for(int i =1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		
		for(int k=5;k>=i;k--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}*/

  /*
       
             ***** 
	  **** 
	   ***
	    **	
	     *	
	
	/*for(int i=1;i<=5;i++){
	
	for(int k=4;k>=i;k--){
	System.out.print(" ");
	}
		for(int j=alpha;j<(alpha+i);j++){
			System.out.print((char)j+" ");

		}
		
	System.out.println();
}
}
}*/

	 