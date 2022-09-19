package septembersix;

public class Test0809 {
	 public static int rentalCarCost(int d) {
		 int rent = 40;
		if(d >= 3 && d < 7) {
			 return rent = (rent * d) - 20;
		 }  if(d >= 7) {
			 return rent = (rent * d) - 50;
		 }
		 return rent;
		 
		 
		    // Your solution here
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rentalCarCost(4));
		

	}

}
