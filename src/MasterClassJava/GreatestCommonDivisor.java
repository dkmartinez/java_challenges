package MasterClassJava;

public class GreatestCommonDivisor {
	
	public static int getGreatestCommonDivisor (int y, int z) {
		int rem = 0;
		
		if(y < 10 || z < 10) {
			return -1;
		}
		if(y < z) {
			for(int i = 1; i < z; i++) {
				if(y % i == 0 && z % i == 0) {
					rem = i;
				}
			}
		}else if(z < y) {
			for(int i = 1; i < y; i++) {
				if(y % i == 0 && z % i == 0) {
					rem = i;
				}
			}
		}
		
		
		return rem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println(getGreatestCommonDivisor(1010, 10));

	}

}
