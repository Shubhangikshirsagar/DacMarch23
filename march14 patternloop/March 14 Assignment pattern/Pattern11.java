/*   
*/

/* * * * * * * *
    * * * * *
      * * *
        *
*/

class Pattern11
{
	public static void main(String[]args)
	{
	
		for( int i=1;i<=5;i++)//row
		{
			for(int k=5;k>=i;k--)// to give space one more forloop
			{
			System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" +" ");
			}
			for(int l=2 ;l<=i;l++)
			{
				System.out.print("*" +" ");
			}
			System.out.println();
			
		}    }
}