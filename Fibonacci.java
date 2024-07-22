package com.example.pratcise;

import java.util.Scanner;

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 38, 
public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Enter the Element till you get Fibonacci Series");
		Scanner myObj = new Scanner(System.in);

		int input_Value = myObj.nextInt();

		int value = 0;
		int p = 0;
		int q = 1;
		for (int i = 2; i < input_Value; i++) 
		{
			value = p + q;
			System.out.println(value);
			p = q;              
			q = value;

		}
		//System.out.println(value);
	}

}
