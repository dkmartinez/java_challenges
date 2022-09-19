package MasterClassJava;

public class IsOdd {
	
	
	
	
	public static boolean isOdd(int number) {
		if( number % 2 == 0 || number < 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public static int sumOdd(int start, int end) {
		int sum = 0;
		if(start <= 0 || end <= 0 || end < start) {
			return -1;
		}else {
			for(int i = start; i <= end; i++) {
				if(isOdd(i)) {
					sum += i;
				}
				
			}
		}
		return sum;
	}
	
	public static boolean isEvenNumber(int num) {
		if(num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	

	
	public static void main(String[] args) {
		
		
		
//		System.out.println(sumOdd(100, 1000));
//		
//		int number = 4;
//		int finishNumber = 20; 
//		int evenNumbersFound = 0;
//		
//		while(number <= finishNumber) {
//			number++;
//			if(!isEvenNumber(number)) {
//				continue;
//			}
//			evenNumbersFound++;
//			if(evenNumbersFound == 5) {
//				break;
//			}
//			System.out.println( "Even number " + number);
//			
//		}
//		System.out.println("Total even numbers found: " + evenNumbersFound);
	}

}
