package test;

public class doubleArray {

	
	
	  public static String fakeBin(String numberString) {
		  
		  int number = Integer.parseInt(numberString);
	      
	     if(numberString.contains("1")) {
	    	 return numberString.replaceAll("1", "0").replaceAll("2", "0");
	     }else {
	    	 return numberString.replaceAll("4", "1");
	     }
	    }
	  
	  
//	public static int[] map(int[] arr) {
//	    int oldValue;
//	    
//	    for(int i = 0; i < arr.length; i++){
//	      
//	      oldValue = arr[i];
//	      
//	      System.out.println((int)Math.sqrt(arr[i]));
//	      
//	      
//	    }
//	    return arr;
//
//	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr [] = {1,2,3};
//		
//		map(arr);
		System.out.println(fakeBin("111124"));
		

	}

}
