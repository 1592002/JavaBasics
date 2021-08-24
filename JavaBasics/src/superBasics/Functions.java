package superBasics;

public class Functions {
	
	public static void placeBread()
	{
		System.out.println("...Bread...");
	}
	public static void placePatty()
	{
		System.out.println("&&&Patty&&&");
	}
	public static void plaecPickel()
	{
		System.out.println("$$$Pickel$$$");
	}
	public static void makeSandwhich(int n)
	{
		
		placeBread();
		if(n==2)
		{
		placePatty();
		
		}
		else
		{
			plaecPickel();
		}
		placeBread();
		}
		
	
	
	public static void main(String[] args) {
		
		makeSandwhich(1);
		
	}
}
