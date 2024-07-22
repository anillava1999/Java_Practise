package com.example.pratcise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please Enter the Number to Chrck factorial number");
		
		int inputValue = myObj.nextInt();
        int value = 0;
        int p = 1;
        int q = 2;
        for(int i =2; i<=inputValue; i++) 
        {
            value = p * q;
            p = value;
            q = i+1;
            
        }
        System.out.println(value);
	}

}
