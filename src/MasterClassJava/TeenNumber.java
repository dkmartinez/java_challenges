package MasterClassJava;

public class TeenNumber {
	
	public static boolean hasTeen (int a, int b, int c) {
		if(a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isTeen(int d) {
		return hasTeen(d,d,d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(hasTeen(22, 23, 34));
			System.out.println(isTeen(14));
	}

}
