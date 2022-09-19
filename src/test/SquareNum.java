package test;

public class SquareNum {
	
	public static int squareSum(int[] n)
	  { 
	
		int square=0;
	    
		for(int i = 0; i < n.length; i++) {
	    	
			int op = n[i]*n[i];
			square+=op;
		 
	    }
		
		
		return square;
	    
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {5,-3,4};
		System.out.println(squareSum(arr));

	}

}
