package MasterClassJava;

public class FourPacker {
	//bigcount represents 5 kilos each
			//smallcount represents 1 kilo each
			//goal represents the represents the goal amount of kilos of flour needed to assemble a package.
			//the sum of kilos + bigcount = goal
			// true if it is possible to make a package with goal kilos of flour.
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		
		
		if( bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
	
		bigCount = bigCount * 5;
		int sum = bigCount + smallCount;
		
		
		if(sum >= goal && bigCount <= goal ) {
			return true;
		}else if(bigCount >= goal && smallCount != 0 && sum - goal > 5 ) {
			return true;
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canPack(0,5,6)); //false
		System.out.println(canPack(1,0,5)); //true
		System.out.println(canPack(4,18,19)); //true
		System.out.println(canPack(2,1,5)); //true
		System.out.println(canPack(1,0,4)); //false
		System.out.println(canPack(0,5,4)); //true
		System.out.println(canPack(2,2,12)); //true
		System.out.println(canPack(5,3,24));

	}

}
