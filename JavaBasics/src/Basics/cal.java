package Basics;

public class cal {

	//instance variables
	static int A=27;
	//one variable methods
	public static void add()
	{
		//local variable
		int add=A+27;
		//print function
		System.out.println("sum is :"+add );
		
	}
	//two variable method
	public static void add(int B)
	{
		//local variable
		int add=A+B;
		//print function
		System.out.println("sum is :"+add );
		
	}
	//three variable method
		public static void add(int B,int C)
		{
			//local variable
			int add=A+B+C;
			//print function
			System.out.println("sum is :"+add );
			
		}
		
		//main method
		public static void main(String[] args)
		{
			System.out.println("Example for method overloading");
			add();
			add(25);
			add(36,25);
		}
		
}
