package septembersix;

public class NumbersDivision {
//find the divisors of numbers 
	
	public static int divisor_sum(int n){
	
		for(int i = 0; i <= n; i++) {
			if(n % 2 == 0) {
				n +=n;
				return n;	
			}else if(n % 2 != 0) {
				return n;
			}
		
		}
		return n;
    }

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	
	System.out.println(divisor_sum(15));
			}
			


}

