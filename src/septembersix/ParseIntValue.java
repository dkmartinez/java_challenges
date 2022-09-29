package septembersix;

public class ParseIntValue {
	public static int howOld(final String herOld) {

		  //your code here, return correct age as int ; 
			char age = herOld.charAt(0);
			String s = Character.toString(age);
		    int solution = Integer.parseInt(s);
		  
		    return solution;
		  
		  }
	
	 public static int[] humanYearsCatYearsDogYears(final int humanYears) {
		    // Your code here!
		 int firstYear = 15;
		 int secondYear = 9;
		 int catYear = 0;
		 int dogYear = 0;
		 
		 if ( humanYears == 1) {
			 catYear = firstYear;
			 dogYear = firstYear;
		 } else if( humanYears == 2) {
			 catYear = firstYear + secondYear;
			 dogYear = firstYear + secondYear;
		 } 
		 else if(humanYears >= 3) {
			 catYear = firstYear + secondYear + (humanYears * 4) - 8;
			 dogYear = firstYear + secondYear + (humanYears *5) - 10;
		 }
		 	System.out.println(humanYears + " cat: " + catYear + " dog: " + dogYear);
		    return new int[]{humanYears,catYear,dogYear};
		  }
	 

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		humanYearsCatYearsDogYears(3);
	}

}
