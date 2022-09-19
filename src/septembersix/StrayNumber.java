package septembersix;

public class StrayNumber {

	public static int stray(int[] numbers) {
	    
	    int num = numbers[0];
	    for (int i = 0; i < numbers.length; i++){
	    	
	    	if(num != numbers[i]){
	        num = numbers[i];
	        
	        return num;
	      }
	    	else if(numbers[0] != numbers[1]) {
	    		 num = numbers[0];
	    		 return num;
	    	}
	
	    }
	     return 0;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int [] arr = { 17, 3, 17, 17,  17, 17, 17};
		
		System.out.println(stray(arr));
		

	}

}
