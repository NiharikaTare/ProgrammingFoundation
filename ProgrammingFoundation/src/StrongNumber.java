
public class StrongNumber {
	// 145 = 1! + 4! + 5!
	// 1+24+120
	// 145

	public static void main(String[] args) {
		isStrongNumber(145);
	}

	public static int calculateFact(int number) {

		int result = 1; // bcz multiplication
		int counter = number;

		while (counter >= 1) {

			result = result * counter;
			counter--;
			// counter = counter - 1;

		}
		return result;
	}

	public static boolean isStrongNumber(int number) {
		// return type is boolean
		// is is added when method type is boolean
		
		int digit = 0;
		int sum = 0;
		int temp = number;
		
		while(number>0) {
			digit = number % 10;
			sum = sum + calculateFact(digit);
			System.out.println(digit);
			number = number / 10;
			
		}
		
		System.out.println(sum);
		System.out.println(number);
		
		if(temp == sum) {
			return true;
		}
		else
		return false;

	}
}
