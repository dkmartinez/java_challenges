package MasterClassJava;
import java.util.Scanner;
public class InputCalculation {
	
	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		double average = 0;
		double value = 0;
		double counter = 0;
		
		
		
		while(true) {
			
			System.out.println("Write a Number: ");
			boolean isValid = scanner.hasNextDouble();
			
		
			if(isValid) {
				value = scanner.nextDouble();
				counter++;
				sum+= value;
				average = Math.round(sum/counter);
				scanner.nextLine();
				
			}if(!isValid && value != 0) {
				System.out.println("SUM = " + sum +  " AVG = " + (int)average);
				break;
			}
			if(!isValid) {
				System.out.println("SUM = 0 AVG = 0");
				break;
			}
			
		}
		
		scanner.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inputThenPrintSumAndAverage();
	}

}
