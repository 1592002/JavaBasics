package superBasics;

import java.util.Scanner;

// Program to compare two number and add them if there are equal(A=B),Substract them if A >B,Multiply if A<B  
//Run the program only if the inputs greater than 27
public class Nestedloop {

	int A;
	int B;
	static double output;

	public static void compare(double A, double B) {
		if (A > 27 && B > 27) {
			if (A == B) {
				output = A + B;
				System.out.println(+A + " is equal to " + B + " So Addition of given two numbers is :" + output);
			} else if (A > B) {
				output = A - B;
				System.out.println(+A + " is greater than " + B + " So Subtraction of given two numbers is :" + output);
			} else if (A < B) {
				output = A * B;
				System.out.println(+A + " is Less than " + B + " So Multiplication of given two numbers is :" + output);
			}
		} else

			System.out.println(
					"Given inputs are not upto  the stanadard,there are less than 27 so we can't do anything  ");

	}

	public static void main(String[] args) {
		// System.in is a standard input stream
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number- ");
		double a = sc.nextDouble();
		System.out.print("Enter second number- ");
		double b = sc.nextDouble();
		sc.close();
		compare(a, b);

	}

}
