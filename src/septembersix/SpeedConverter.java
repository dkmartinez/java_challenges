package septembersix;

public class SpeedConverter {
	
	public static long toMilesPerHour(double kilometersPerHour) {
		double formula = kilometersPerHour / 1.609;
		formula = Math.round(formula);
		int convert = (int)formula;
		
		
		
		if(kilometersPerHour < 0) {
			return -1;
		}else {
			return convert;
		}
		
		
	}
	
	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		}else {
			System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printConversion(1.5);
		printConversion(10.25);
		printConversion(-5.6);
		printConversion(25.42);
		printConversion(75.114);
	}

}
