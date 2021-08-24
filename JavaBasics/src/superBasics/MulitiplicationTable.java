package superBasics;
// This Program calcualte the given input upto 100 times 
import java.util.Scanner;

public class MulitiplicationTable {

	static int a = 2;
	static double result;
	static double n;

	public static void main(String[] args) {
		double i;
		//It is listen for input using Scanner method. 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number- ");
		// it is store the value to a variable a using nextDouble method. 
		double a = sc.nextDouble();
		System.out.print("Enter the number that you want run this calculation- ");
		double n = sc.nextDouble();
		// Using a close method to aviod the leaks.
		sc.close();
		for (i = 1; i <= n; i++) {
			result = i * a;
			System.out.println(a + "*" + i + "=" + result);
		}

	}
}
