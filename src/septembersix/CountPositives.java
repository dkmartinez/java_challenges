package septembersix;

//Return an array, where the first element is the count of positives numbers 
//and the second element is sum of negative numbers. 0 is neither positive nor negative.
//
//If the input is an empty array or is null, return an empty array.

public class CountPositives {
	
	public static int[] countPositivesSumNegatives(int[] input)
    {
		
		  if(input == null || input.length == 0) {
	    	  int[] emptyarr = {};
	    	  return emptyarr;
	      }
      int sum = 0;
      int count = 0;
      int [] arr = new int [2];
    
      
      for(int i = 0; i < input.length; i++){
        if(input[i] < 0){
          sum += input[i];
          arr[1] = sum;
          
        }if(input[i] >= 0){
          count++;
          arr[0] = count; 
         
        }
      }
        return arr;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//System.out.println(countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
		System.out.println(countPositivesSumNegatives(new int[] {}));
	}

}
