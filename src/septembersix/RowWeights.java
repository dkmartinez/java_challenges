package septembersix;

public class RowWeights {
	
	
	public static int[] rowWeights (final int[] weights){
		int [] args = new int[2];
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < weights.length; i++ ) {
			if(i % 2 == 0) {
				a += weights[i];
				args[0] = a;
				
			}else {
				b += weights[i];
				 args[1] = b;
			}
		}
		return args;
    
    }
	
	

	public static void main(String [] args) {
		
		int []value = {70,58,75,34,91};
		
		int[] response = rowWeights(value);

		
		System.out.println(response);
		
	}

}
