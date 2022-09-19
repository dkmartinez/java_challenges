package MasterClassJava;

public class BarkingDog {
	public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
		
		if(hourOfDay < 0 || hourOfDay > 23) {
			return false;
			
		} else if(hourOfDay < 8  && barking || hourOfDay > 22 && barking ) {
			return barking;
		}

		else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shouldWakeUp (true, 1));
		System.out.println(shouldWakeUp(false, 2));
		
		System.out.println(shouldWakeUp(true, 8));
		System.out.println(shouldWakeUp (true, -1));

	}

}
