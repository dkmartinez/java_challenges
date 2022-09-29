package septembersix;

public class Main {
	  public static int[] countBy(int x, int n){
		    int [] value = new int[n];
		    	int j = 1;
			   for(int i = 0; i < n; i++){
				   
			     value[i] = x * j;
			     j++;
			  			   } 
			 
		    // Your code here
		    return value;
		  }
	  //https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/java
	  public static int[] between(int a, int b) {
		    // your code here
		  if(a <= 0) {
			  b = ((a *-1) + b + 1);
		  }
		  int []value = new int[b];
	
		  for(int i = 0; i < b; i++) {
			  value[i] = a++;
			  System.out.println(value[i]);
			  
		  }
		  
		  
		    return value;
		  }
	  
	  
	  
	  public static int findShort(String s) {
		  
		String[] word = s.split(" ");
		int size = Integer.MAX_VALUE;
		
		 for(int i = 0; i < word.length; i++) {
			
			if(word[i].length() < size) {
				size = word[i].length();
			}
		 }
		  
		  return size;
	    }
	  
	   public static String repeatStr(final int repeat, final String string) {
		   		if(repeat == 0){
		          return string;
		        }
		   		String w = "";
		   		String [] word = new String[repeat];
		      
		      for(int i = 0; i < repeat; i++){
		    	word[i] = string;
		    	w += word[i];
		      }
		  return w;
		    }
	  
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatStr(4,"ab"));
		
	
	}

}
