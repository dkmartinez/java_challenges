package septembersix;

public class AlternateCapitalization {
	
	 public static String[] capitalize(String s){
		 char [] letter = new char[s.length()];
		
		 for(int i = 1; i < s.length(); i++) {
			 letter[i] = s.charAt(i);
			 	int j = i+1;
				 
				 if(i == j) {
					 System.out.println(Character.toUpperCase(letter[i]));
				 } else {
					 System.out.println(Character.toUpperCase(letter[i]));
				 }
			
			 }
		 
	
	        return new String[2];
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		capitalize("noso");

	}

}
