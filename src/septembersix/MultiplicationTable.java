package septembersix;

public class MultiplicationTable {
	
	   public static String multiTable(int num) {
		   String sentence = "";
		   
		  for (int i = 1; i <= 10; i++){
		int op = num * i;
		if(i < 10 ) {
		sentence += i + " * " + num + " = " + op + "\n";
		}
		else if(i == 10) {
			sentence += i + " * " + num + " = " + op;
		}
		}
			return sentence;
		
		   
	   }
		    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multiTable(5);
		System.out.print(multiTable(5));

	}

}
