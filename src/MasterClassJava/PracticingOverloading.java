package MasterClassJava;

public class PracticingOverloading {

	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		double feetInches = feet * 12;
		double inchesCm = (feetInches + inches) * 2.54;
		if(feet >= 0 && inches >= 0 && inches <=12) {
			return inchesCm;	
		}else {
			return -1.0;
		}
	}
	
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		double op = inches / 12;
		if(inches >= 0) {
			return op;
			
		}else {
			return -1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcFeetAndInchesToCentimeters(100, 8.3));
		System.out.println(calcFeetAndInchesToCentimeters( 100));
	}

}
