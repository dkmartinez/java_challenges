package septembersix;

public class SumPositive {
	
	 public static int sum(int[] arr){
		 
		 int result = 0;
		 for (int element : arr) {
			 
			 if(element >= 1) {
				 result = result + element;
			 }
		 }
		return result;
		 
		  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {5,-3,-4};
		
		System.out.println(sum(numbers));
		

	}

}
