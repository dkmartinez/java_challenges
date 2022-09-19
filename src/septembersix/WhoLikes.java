package septembersix;

public class WhoLikes {
	
	   public static String whoLikesIt(String... names) {
	        //Do your magic here
		   
		   if(names.length == 0) {
			   return "no one likes this";
		   }
		   if(names.length == 1) {
			   return names[0] + " likes this";
		   }
		   if(names.length == 2) {
			   return names[0] + " and " + names[1] + " like this";
		   }
		   if(names.length == 3) {
			   return names[0] + ", " + names[1] + " and " + names[2] + " like this";
		   }
		   if(names.length >= 4) {
			   return names[0] + ", " + names[1] + " and " +  (names.length -2) +" others like this";
		   }
		   
		   return "";
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(whoLikesIt("Max", "John", "Mark", "Maria","Mark", "Maria","Mark", "Maria","Mark", "Maria"));

	}

}
