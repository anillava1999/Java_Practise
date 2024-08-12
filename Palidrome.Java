/**
 * 
 */
package Practise;

import java.lang.reflect.Array;

/**
 * 
 */
public class Plaindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating Object for the class --> findPalindrome()
		findPalindrome obj = new findPalindrome();
		//Word to check the Palidrome
		String input = "Malayalam";
		if (obj.Palindrome(input)) {
			// if return is true will mention word is palidrome
			System.out.println("Word is Palindrome");
		} else {
			// if return is false will mention word is not palidrome
			System.out.println("Word is not an Palindrome");

		}

	}

}

class findPalindrome {

	public boolean Palindrome(String input) {

		//Converting Word character into lowercase
		String input_extra = input.toLowerCase();
		
		// Extracting all characters into array
		char[] charArray = input_extra.toCharArray();
		
		// Iterating the Character one by one with help of lenght of CharArrya
		for (int i = 0; i <= charArray.length - 1; i++) {

			// here "charArray[charArray.length - (i + 1)]" this will character from last index like reverse
			// charArray[i] this will give forward character with forward index
			if (charArray[charArray.length - (i + 1)] != charArray[i]) {
				
				// if last index and first index doesn't match return as false, it will check for all index like comparing forward and backward
				return false;
			}
		}
		// if last index and first index match return as true, it will check for all index like comparing forward and backward
		return true;
	}

}
