/**
 * 
 */
package Practise;

/**
 * 
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reverse obj = new Reverse();
		obj.ReverseNumber(1234);

	}

}

class Reverse {

	public static void ReverseNumber(int input) {

		// Declare ReverseNumber as 0
		int reverse_number = 0;

		while (input != 0) {

			// remainder = 1234 % 10 = 4
			int Remainder = input % 10;
			// reverse = 0 * 10 + 4 = 4
			reverse_number = reverse_number * 10 + Remainder;
			// number = 1234 / 10 = 123
			input = input / 10;

		}

		System.out.println(reverse_number);
	}

}
