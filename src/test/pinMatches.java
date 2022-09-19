package test;

public class pinMatches {
	
	public static boolean validatePin(String pin) {
	    
	    if(pin.length() == 6 && pin.matches("[0-9]+") ||  pin.matches("[0-9]+")  && pin.length() == 4)
{
	        return true;
	    }
	    else {
	      return false;
	    }
	  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(validatePin("12322"));

	}

}
