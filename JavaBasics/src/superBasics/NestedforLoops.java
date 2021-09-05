package superBasics;

import org.junit.Test;
//import org.junit.FixMethodOrder;
//import org.junit.runners.MethodSorters;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NestedforLoops {
	

//	/*
//	 ****
//	 ***** 
//	 ***** using loops.
//	 *****/

	@Test
	public void testCase1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("*****");

		}
	}

////
	@Test
	public void testCase2() {
		for (int i = 1; i <= 5; i++) {// this loop will cover the lines

			for (int j = 1; j <= 5; j++) {// inner loop, will print

				System.out.print("*");
			}
			System.out.println("");// to start a new line
		}
	}
//	
//	/*
//	 *
//	 ** 
//	 *** using loops.
//	 ****/

	@Test
	public void testCase3() {
		for (int i = 0; i <= 5; i++) {// this loop will cover the lines

			for (int j = 0; j < i; j++) {// inner loop, will print
				System.out.print("*");
			}
			System.out.println("");// to start a new line
		}
	}

//	/*****
//	 ****
//	 *** 
//	 ** using loops.
//	 */

	// @Test
	public void testcase4()

	{
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	@Test
	public void testcase5() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Test
	public void testcase6() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	@Test
	public void testcase7() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

//	   * 
//    ** 
//   *** 
//  **** 
// ***** 
//  **** 
//   *** 
//    ** 
//     * 
	@Test
	public void testcase8() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k > i; k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	// X-Mas Tree just need to add a space in output before *
	@Test
	public void testcase9() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 10; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println(" ");
		}

	}

	// Pyramid with Alphabets 
	@Test
	public void testCase10() {
		int alpha = 65;
		for (int i = 1; i <= 5; i++) {// this loop will cover the lines

			for (int j = 0; j < i; j++) {// inner loop, will print
				System.out.print((char) (alpha + j) + " ");
			}
			System.out.println("");// to start a new line
		}
	}
// Asci value of A-Z=65 to 90 and a-z=97 to 122
	
	@Test
	public void testCase11() {
		int alpha = 65;
		for (int i = 1; i <= 5; i++) {// this loop will cover the lines

			for (int j = 0; j < i; j++) {// inner loop, will print
				System.out.print((char) (alpha) + " ");
			}
			alpha++;
			System.out.println();// to start a new line
		}
	}
	
	@Test
	public void testCase12() {
		int alpha = 65;
		for (int i = 1; i <= 7; i++) {// this loop will cover the lines

			for (int j = 0; j <i; j++) {// inner loop, will print
				System.out.print((char) (alpha+j) + " ");
			}
			alpha=alpha+i;
			System.out.println();// to start a new line
		}
	}
	@Test
	public void testCase13() {
		int alpha = 0;
		for (int i = 1; i <= 7; i++) {// this loop will cover the lines

			for (int j = 0; j <i; j++) {// inner loop, will print
				System.out.print((alpha+j) + " ");
			}
			alpha=alpha+i;
			System.out.println();// to start a new line
		}
	}
	@Test
	public void testCase14() {
		int alpha = 0;
		for (int i = 1; i <= 7; i++) {// this loop will cover the lines

			for (int j = 0; j <i; j++) {// inner loop, will print
				System.out.print((alpha+j) + " ");
			}
			
			System.out.println();// to start a new line
		}
	}
}
