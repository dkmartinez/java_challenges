package MasterClassJava;

public class FirstAndLastDigit {
	
	
	public static int sumFirstAndLastDigit(int number) {
		
		int num = number;
		int last = num % 10;
		if(number < 0 ) {
			return -1;
		}
		
	
		while(number > 0) {	
			
			if(number < 10) {
				return number + last;
			}
			number /= 10;
		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumFirstAndLastDigit(-52));

	}

}
