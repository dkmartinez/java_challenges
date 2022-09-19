package MasterClassJava;

public class NumberPalindrome {
	
	public static boolean isPalindrome (int number) {
		int reverse = 0;
		int lastDigit = 0;
		
		if(number < 0) {
			number *= -1;
			System.out.println(number);
		}
		
		int num = number;
		

		while(number > 0) {
			lastDigit = number % 10;
			
			reverse = (reverse * 10) + lastDigit;
			
			number /= 10;
		}
		
		if(num == reverse) {
			return true;
		}else {
			return false;
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(5343));
		
		}  
	}


