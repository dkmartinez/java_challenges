package MasterClassJava;

public class MinutesToYears {
	
	public static void printYearsAndDays(long minutes) {
		long hour = minutes / 60;
		long day = hour / 24;
		long years = day / 365;
		long mins = day % 365;
		
		
		
		if(minutes < 0) {
			System.out.println("Invalid Value");
		}else {
			System.out.println(minutes + " min = " + years + " y and " + mins + " d");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printYearsAndDays(561600);
		

	}

}
