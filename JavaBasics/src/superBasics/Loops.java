package superBasics;

public class Loops {

	public static void main(String[] args) {
//		for(int i=1;i<=6;i=i+2)
//		{
//		System.out.println(i);
//		for(int n=2;n<=i;n=n+2)
//		System.out.println(n);
//}
		int i = 0;
	
		for(i=1;i<=6;i++)
		{
			int R=i%2;
		if(R==0)
		{
			System.out.println("vamsi"+i);
		}
		else
			System.out.println("Sai"+i);
			
	}
	}
}
