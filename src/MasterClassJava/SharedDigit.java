package MasterClassJava;

public class SharedDigit {
	
	
	public static boolean hasSharedDigit(int one, int two) {
	
		if(one >= 10 && one <= 99 && two >= 10 && two <= 99) {
			int oneLastDigit = one % 10;
			int twoLastDigit = two % 10;
			int oneFirstDigit = one / 10;
			int twoFirstDigit = two/ 10;
			
			
			if (oneLastDigit == twoLastDigit || oneFirstDigit == twoFirstDigit  || oneFirstDigit == twoLastDigit || oneLastDigit == twoFirstDigit) {
	
				return true;
			}
			
			
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(hasSharedDigit(13,21));
	}

}
