class Static_Nonstatic{
	
	int i=90; 
	static  int c;
	 static void display(){
		System.out.println(c);
		System.out.println(i);
	}
	public static void main(String args[]){
		
		display();
	}
}