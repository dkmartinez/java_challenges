package MasterClassJava;

public class SecondsMinutes {
	
	public static String getDurationString(int minutes, int seconds) {
		
		int hrs = minutes / 60;
		int rem = minutes % 60;
		
		int min = seconds / 60;
		min = min + rem;
		
		String sentence =  hrs +"h " + min + "m " + seconds + "s";
		
		if(minutes >= 0 && minutes <= 59 || seconds >= 0 && seconds <= 59 ) {
			
			return sentence;

		}else {
			return "Not valid";
		}
	}
	
	public static String getDurationString(int seconds) {
		int minuts = seconds/ 60;
		seconds =  seconds % 60;
		
		if(seconds <= 0) {
			return "Not a valid value";
		}else {
			return minuts + "m " + seconds + "s";
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getDurationString(125, 59));
		System.out.println(getDurationString(61));

	}

}
