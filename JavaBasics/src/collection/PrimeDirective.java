package collection;

//Import statement:
import java.util.ArrayList;

public class PrimeDirective {

// Method to check for prime numbers:
	public boolean isPrime(int number) {
		if (number == 2) {
			return true;
		} else if (number < 2) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

//Method to check for even or odd
	public static Boolean isEven(int num) {

		if (num % 2 == 0) {
			return true;
		} else
			return false;

	}

	// Method to create a Prime Arraya list
	public ArrayList<Integer> onlyPrime(int[] numbers) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int number : numbers) {
			if (isPrime(number)) {
				primes.add(number);
			}
		}
		return primes;
	}

	// Method to create a Even Arraya list
	public ArrayList<Integer> onlyEven(int[] numbers) {
		ArrayList<Integer> even = new ArrayList<Integer>();
	
		for (int number : numbers) {
			if (!isEven(number)) {
				
			} else {
				even.add(number);

			}
		}
		return even;
	}

	public static void main(String[] args) {

		PrimeDirective pd = new PrimeDirective();
		int[] numbers = { 6, 29, 28, 33, 11, 100, 101, 43, 89 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("The number is " + numbers[i] + " Prime: " + pd.isPrime(numbers[i]));
			System.out.println("The number is " + numbers[i] + " Even: " + pd.isEven(numbers[i]));
		}
		System.out.println("Prime number are :" + pd.onlyPrime(numbers));
		System.out.println("Even number are :" + pd.onlyEven(numbers));
	}

}
