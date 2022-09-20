package MasterClassJava;

public class NumberToWords {
	
	public static void numberToWords(int number) {
		int lastNumber = 0;
		
		if(number < 0) {
		System.out.println("Invalid Value");
		}else if (number == 0) {
			System.out.println("Zero");
		}
		int counter = getDigitCount(number);

		number = reverse(number);
		int beforeNumber = getDigitCount(number);
		
		int diferencia = counter - beforeNumber;
		

		while(number > 0) {
		lastNumber = number % 10;
		
			switch(lastNumber) {
			case 0: System.out.println("Zero");
			break;
			case 1: System.out.println("One");
			break;
			case 2: System.out.println("Two");
			break;
			case 3: System.out.println("Three");
			break;
			case 4: System.out.println("Four");
			break;
			case 5: System.out.println("Five");
			break;
			case 6: System.out.println("Six");
			break;
			case 7: System.out.println("Seven");
			break;
			case 8: System.out.println("Eight");
			break;
			case 9: System.out.println("Nine");
			break;
			default: System.out.println("Invalid Value");
			}
			number /= 10;
			
		}
		
		if (diferencia != 0) {
			for( int i=0; i < diferencia; i++) {
				System.out.println("Zero");
			}
		}
		
	}
	
	
	public static int reverse(int number) {
		int lastDigit = 0;
		int reverse = 0;
		int negative = number;

		
		if(number < 0) {
			number = number * -1;
		}
		while(number > 0) {

			lastDigit = number % 10;
			reverse = (reverse * 10) + lastDigit;
			number /= 10;
		}
		if (negative < 0) {
			return -reverse;
		}
		
		return reverse;

	}
	
	public static int getDigitCount (int number) {
		
		int counter = 0;
	
		if(number < 0) {
			return -1;
		}else if(number == 0) {
			return 1;
		}
		
		while(number > 0) {

			number /= 10;
			counter +=1;
		}
		
		return counter;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberToWords(0);
		System.out.println(getDigitCount(1));

	}

}
