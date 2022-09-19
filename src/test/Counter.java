package test;

public class Counter {
	
	 public static int countSheeps(Boolean[] arrayOfSheeps) {
		    // TODO May the force be with you
		    int count = 0;
		    for(int i = 0; i < arrayOfSheeps.length; i++){
		     boolean array =  arrayOfSheeps[i];
		      
		      if(array){
		        return count +=1;
		      }
		  
		    }
		    return count;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean [] counters = {true, true, false};
		System.out.println(countSheeps(counters));
		

	}

}
