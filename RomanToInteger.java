package Practice;

public class RomanToInteger {
	public static void main(String[] args) {
		String romanNumeral = "IX"; 
		int integer = romanToInteger(romanNumeral);
		System.out.println("The Roman numeral " + romanNumeral + " is equivalent to the integer " + integer);
	}

	public static int romanToInteger(String roman) {
		int result = 0;
		int prevValue = 0;

		for (int i = roman.length() - 1; i >= 0; i--) {
			char currentChar = roman.charAt(i);
			int currentValue = romanDigitValue(currentChar);

			if (currentValue < prevValue) {
				result -= currentValue;
			} else {
				result += currentValue;
			}

			prevValue = currentValue;
		}

		return result;
	}

	public static int romanDigitValue(char romanDigit) {
		switch (romanDigit) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			throw new IllegalArgumentException("Invalid Roman numeral character: " + romanDigit);
		}
	}
}
