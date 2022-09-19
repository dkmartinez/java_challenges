package septembersix;

public class CalculateAverage {

	
	 public static double find_average(int[] array){
		 double op = 0;
		 double num = 0;
		 for(int i = 0; i < array.length; i++) {
			num += array[i];
		
			 op = num / array.length;
			
		 }
		 
		 return op;
		
		    
	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,1,1};
		int [] arr2 = {1,2,3,4};
		
		double op = 10/4f;

		System.out.println(find_average(arr2));

	}

}
