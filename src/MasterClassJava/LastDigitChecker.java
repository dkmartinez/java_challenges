package MasterClassJava;

public class LastDigitChecker {
	
	public static boolean hasSameLastDigit(int x, int y, int z) {
		int lastx = x % 10;
		int lasty = y % 10;
		int lastz = z % 10;
		
		if(isValid(x) && isValid(y) && isValid(z)) {
			if( lastx == lasty || lastx == lastz || lasty == lastz) {
				return true;
			}
		}
			return false;
		
	}
	
	public static boolean isValid (int x) {
		if(x >= 10 && x <= 1000) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(hasSameLastDigit (5, 32, 42));
		System.out.println(isValid(100000));

	}

}
