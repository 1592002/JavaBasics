package collection;

import java.util.Arrays;

//import java.util.Arrays;

public class Sorting {

	static double numbers[] = { 178, 1, 25, 7.8, 14, -1, 27, 36, 25,1,25 };
	// static int numbers[] = { 10,100,8,7,6,10,4,3,2,1};
	// static int numbers[] = { 22,45,3,67,34,67,89,15,94};
	static int A;
	static int count=0;

	public static void largest() {
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] > numbers[i + 1]) {
				//swaping
				double temp = numbers[i];
				numbers[i] = numbers[i + 1];
				numbers[i + 1] = temp;
				i = -1;
			}else if(numbers[i] ==numbers[i + 1])
			{
				count=count+1;
			}
		}
		
		System.out.println(Arrays.toString(numbers));
		System.out.println("Smallest number is "+numbers[0]);
		System.out.println("Largest number is "+numbers[numbers.length-1]);

	}

	public static void main(String[] args) {
		System.out.println("Lenght of Array is : " +numbers.length);
		largest();
	}
}
