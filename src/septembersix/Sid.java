package septembersix;

public class Sid {
	
	public static String howMuchILoveYou(int nb_petals) {
	    String phrase = "";
	      
	      switch(nb_petals){
	          case 1: phrase = "I love you";
	          break;
	          case 2: phrase = "a little";
	          break;
	          case 3: phrase = "a lot";
	          break;
	          case 4: phrase = "passionately";
	          break;
	          case 5: phrase = "madly";
	          break;
	          case 6: phrase = "not at all";
	          break;
	          
	          default: phrase = "";
	      }

	    return phrase;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(howMuchILoveYou(25));

	}

}
