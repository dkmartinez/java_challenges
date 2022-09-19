package septembersix;

public class MinNumber {
	
	public static int min(int [] args) {
		
		int value = args[0];
		for(int i = 0; i < args.length; i++) {
			if(value > args[i]) {
				value = args[i];
			}
		}
		return value;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {31, 2,5,-325, 7,1,8};
		System.out.println(min(numbers));

	}

}
