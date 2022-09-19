package MasterClassJava;

public class EvenDIgitSum {
	public static int getEvenDigitSum (int number) {
		int sum = 0;
		int last = 0;
		
		if(number < 0) {
			return -1;
		}
		
		while( number > 0) {
			last = number % 10;
			
			if(last % 2 == 0) {
				sum += last;
			}
			number /= 10;
		}
		return sum;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getEvenDigitSum(252));
	}

}
