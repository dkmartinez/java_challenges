package MasterClassJava;

public class PlayingCat {
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if(!summer && temperature >= 25 && temperature <= 35) {
			return true;
		}
		 else if (summer && temperature <= 45 && temperature >= 25){
				return true;
			}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isCatPlaying(true, 10));

	}

}
