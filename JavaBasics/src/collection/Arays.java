package collection;
//Creating an array

import java.util.Arrays;

import org.junit.Test;

public class Arays {

//	To Create a Array and to print it(Need to Use toString method)
	@Test
	public void getTopics() {
		String[] topics = { "Opinion", "Tech", "Science", "Health" };
		String betterPrintout = Arrays.toString(topics);
		System.out.println(betterPrintout);
		System.out.println(Arrays.toString(topics));

	}

	// Get Element By Index and to sort the values
	@Test
	public void getIndex() {
		int[] Index = { 71, 21, 3, 4, 5 };
		Arrays.sort(Index);
		for (int i = 0; i < Index.length; i++) {
			System.out.println(Index[i]);
		}
		System.out.println(Arrays.toString(Index));
	}
}
