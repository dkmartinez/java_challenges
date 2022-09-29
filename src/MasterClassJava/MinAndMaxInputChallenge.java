package MasterClassJava;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
	
	
	 public static long numberOfDivisors(int n) {
		    long counter = 0;
		    for(int i = 1; i <= n; i++){
		       if(n % i == 0){
		    	
		      counter++;
		    }
		    }
		   
		    return counter;
		  }
	 
	 public static int rowSumOddNumbers(int n) {
		
		 return n * n * n;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(numberOfDivisors(4));
		System.out.println(rowSumOddNumbers(42));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		
//		   int min = Integer.MAX_VALUE;
//	        int max = Integer.MIN_VALUE;
////		boolean first = true;
//		
//			while(true) {
//			System.out.println("Enter Number: ");
//			boolean check = scanner.hasNextInt();
//			
//			if(check) {
//				int number = scanner.nextInt();
////				if(first) {
////					first = false;
////					min = value;
////					max = value;
////				}
//				
//				if(number > max) {
//					max = number;
//				}
//				
//				if(number < min) {
//					min = number;
//				}	
//			
//			}else {
//				break;
//			}
//			scanner.nextLine();
//		}
//		
//		System.out.println("Tha max value is " + max + " The min value is " + min);
//		scanner.close();
	}

}
