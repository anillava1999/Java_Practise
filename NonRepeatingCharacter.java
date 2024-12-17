package com.example.pratcise;

import java.util.HashMap;

//1. Problem: Find the First Non-Repeating Character in a String
//
//Write a function to find the first non-repeating character in a given string. If there’s no such character, return -1.
//
//Example:
//Input: "swiss"
//Output: 'w'
//
//Input: "aabbcc"
//Output: -1
//
//Hints:
//
//Use a HashMap to store character frequencies.
//
//Iterate through the string to find the first character with a frequency of 1.

public class Duplicate_Character {

	HashMap<Character, Integer> hm = new HashMap<>();

	
	// Step 1: Find the Frequency of Character 
	public char char_freq(String input) {

		for (char ch : input.toCharArray()) {

			if (hm.containsKey(ch)) {
				int value_hm = hm.get(ch) + 1;
				hm.put(ch, value_hm);
			} else {
				hm.put(ch, 1);
			}

		}

		// Step : Find the first Least frequency character
		for (char ch : input.toCharArray()) {

			if (hm.get(ch) == 1) {
				return ch;
			}

		}
		return '-';

	}

	public static void main(String[] args) {

		Duplicate_Character obj = new Duplicate_Character();
		char result = obj.char_freq("aabbcc");
		System.out.println(result);
		
	
	}

}
