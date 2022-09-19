package septembersix;

public class FindUnique {
	 public static double findUniq(double arr[]) {
	      double number = arr[0];
	      if(number != arr[1] && number != arr[2]) {
	    	  return number;
	      }
	   
	    	  for(int i = 0; i < arr.length; i++){
	    		    
	  	    	if(number != arr[i] ){
	  	          number = arr[i];
	  	          return number;
	  	          
	  	      }
	  	      
	      }
	      
	     
	      // Do the magic
	      return number;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findUniq(new double[]{   4, 1,1, 1,1, 1, 1, 1, 1, 32, 1 }));
		System.out.println(findUniq(new double[]{  0, 0, 0, 0, 0.55, 0 }));
//		System.out.println(findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }));
		

	}

}
