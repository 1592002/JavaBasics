package superBasics;

/*
 * This program check for Even,Odd,Prime and Composite
 * Developed on 2021-AUG-28  
 */
import java.util.Scanner;
// This method Decide the number is Even or Odd 
public class EvenorOdd {
	// check number is Even or Odd
	public static Boolean isEven(int num) {
		int r = num % 2;
		if (r == 0) {
			return true;
		} else
			return false;

	}

	// Check Even numbers in given range
	public static void isEveninRange(int num) {

		if (isEven(num)) {
			for (int i = 0; i <= num; i++) {
				if (isEven(i)) {

					System.out.print(" " + i);
				}

			}
		} else {
			for (int i = 0; i <= num; i++) {
				if (isEven(i)) {

				} else
					System.out.print(" "+i);

			}
		}

	}

	// check number is prime or Composite
	public static Boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
//Check all the number less than given number to check for mulitples 
		for (int i = 2; i < num; i++) {
			int r = num % i;
			if (r == 0) {
				return false;
			}
		}

		return true;

	}

	// Check prime numbers in given range
	public static void isPrimeinRange(int num) {

		for (int i = 2; i <= num; i++) {
			if (isPrime(i)) {

				System.out.print(" " + i);
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Taking a input from the user 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number- ");
// store the input in variable a
		int num = sc.nextInt();
		sc.close();
// passing the value of a to the methods to check for prime 
		if (isPrime(num)) {
			System.out.println("Given number is Prime and other Prime numbers  upto " + num + " are:");
			isPrimeinRange(num);
		} else {
			System.out.println("Given number is Composite  ");
		}

//passing the value of a to the methods to check for Evenorodd 	
		if (isEven(num)) {
			System.out.println("\n");
			System.out.println("Given number is Even and other Even numbers  upto " + num + " are:");
			isEveninRange(num);
		} else {
			System.out.println("\n");
			System.out.println("Given number is Odd and other Odd numbers  upto " + num + " are:");
			isEveninRange(num);
		}
	}
}
