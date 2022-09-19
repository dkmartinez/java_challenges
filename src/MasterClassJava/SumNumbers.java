package MasterClassJava;

public class SumNumbers {
	
	public static int sumDigits(int number) {
	
		
		if(number <= 10 ) {
			return -1;
		}
		int sum = 0;
		//125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 -1 20 = 5
		while(number > 0) {
			//extract the lest-significant digit
			int digit = number % 10;
			System.out.println(digit);
			sum += digit;
			//drop the least-significant digit
			number /= 10; //number = number / 10;
			
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumDigits(122));

	}

}
