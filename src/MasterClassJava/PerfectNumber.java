package MasterClassJava;

public class PerfectNumber {
	
	public static boolean isPerfectNumber(int number) {
		int sum = 0;
		if(number < 1) {
			return false;
		}
		for(int i = 1; i < number; i++) {
			if(number % i == 0) {
				sum += i;
			}
		}
		if ( number == sum ) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPerfectNumber(29));

	}

}
