/**
 * 
 */
package Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		FindDuplicateInString obh = new FindDuplicateInString();
		obh.find_duplicate("India is my Country");
	}
}


// Function class to find the duplicate Character
class FindDuplicateInString {
	
	// Method to find the duplicate Character
	public void find_duplicate(String input) {

		// Using Hashmap Collection framework to find the duplicate character  
		// Becuase it contains Key and Value data 
		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();

		// Converting String value to Character and store it Char Array
		char[] str_value = input.toCharArray();

		// Iterate Char Array value one by one
		for (Character ch : str_value) {
			// if HashMap Array contains Character already
			if (baseMap.containsKey(ch)) {
				baseMap.put(ch, baseMap.get(ch) + 1); // if: yes --> increase the value of key to 1
			} else {
				baseMap.put(ch, 1); // if: no --> add 1 to value of particular key if not exist in array
			}

		}

		// adding key values to the set array to remove the duplicate values in hashmap array
		Set<Character> keys = baseMap.keySet();

		// Iterating Set array values to key variable
		for (Character key : keys) {

			// if hashmap array value is greater than 1 
			if (baseMap.get(key) > 1) {

				// print value is greater than one in hashamap value
				System.out.println(key + " is " + baseMap.get(key) + " times repeated ");

			}

		}

	}

}
