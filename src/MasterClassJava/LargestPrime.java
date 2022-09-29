package MasterClassJava;

public class LargestPrime {
	
	public static int getLargestPrime (int number) {
		if (number >= 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
       
                    number /= i;
                    
                    i--;
                }
            }
            return number;
        }
        return -1;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(getLargestPrime(55));
	}

}
