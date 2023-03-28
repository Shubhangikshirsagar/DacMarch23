import java.util.Scanner;
class Array2DAddition
{
	 public static void main(String args[]){  
    //creating two matrices    
     int arr1[][]={{1,3,4},{2,4,3},{3,4,5}};  
	 /*
	  int a[]={1,3,4};
	  int a[]={{2,4,3};
	  int a[]={{3,4,5};
      arr[0]=a  
	  arr[2]=b  
	  arr[3]=c  
	  
	 */  
    int arr2[][]={{1,3,4},{2,4,3},{1,2,4}}; 

/*
	  int x[]={1,3,4};
	  int y[]={{2,4,3};
	  int z[]={{3,4,5};
      arr[0]=x  
	  arr[2]=y  
	  arr[3]=z  
	  
	 */  	
    
//creating another matrix to store the sum of two matrices    
     int arr3[][]=new int[3][3];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices    
        for(int i=0;i<3;i++)
	{    
        for(int j=0;j<3;j++)
		{    
        arr3[i][j]=arr1[i][j]+arr2[i][j];    //use - for subtraction  
        System.out.print(arr3[i][j]+" ");    
        }    
       System.out.println();//new line    
    }   
}}  


