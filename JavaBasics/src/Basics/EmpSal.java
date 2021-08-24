package Basics;

public class EmpSal {
	 
	public static int netSal(int gsal)
	{
		
	int Nsal=gsal-500;
	return Nsal;
	}
	
	public static int grossSal(int A,int B)
	{
	int gsal=A+B;
	return gsal;
	}
	public static int
montlySal(int A)
	{
	int mSal=A/12;
	return mSal;
	}
	public static void main(String[] vamsi)
	{
	
		int gsal=grossSal(70000,500);
		int Nsal=netSal(gsal);
		
	System.out.println("You'r monthly salary is: " +montlySal(Nsal));
	System.out.println("done it with syso CTRL+space");
}
}
