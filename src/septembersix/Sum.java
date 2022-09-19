package septembersix;

public class Sum {
	 public static int sum(int[] numbers)
	  {
		 if(numbers == null || numbers.length <= 0 ) {
				   return 0;
			   }
		 
	    int highest = numbers[0];
	    int lowest = numbers[0];

	    int num = 0;
	
	    
	    for(int i = 0; i < numbers.length; i++){
	    	num += numbers[i];
	  
		
		  if(numbers[i] > highest) {
		   highest = numbers[i];
		   
	   }else if(numbers[i] < lowest) {
		   lowest = numbers[i];
	   }
	    }
	    
	    return num - highest - lowest;
	    
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(new int[] { }));
	}

}
