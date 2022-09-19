package MasterClassJava;


public class DecimalComparator {
	
	public static boolean areEqualByThreeDecimalPlaces (double one, double two) {
		
		String d = String.valueOf(one);
		String c = String.valueOf(two);
		
		if(one < 0 && two < 0) {
			d = d.substring(1,6);
			c = c.substring(1, 6);
			System.out.println(d);
			System.out.println(c);

		}
		
		else if(d.length() > 4 && c.length() > 4) {
			d = d.substring(0,5);
			c = c.substring(0, 5);
		}

		if(d.equals(c)) {
			return true;
		}
			return false;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
	}

}
