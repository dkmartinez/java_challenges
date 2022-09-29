package septembersix;

public class SumOddEven {
	public static String oddOrEven (int[] array) {
		int num = 0;
		if(array.length == 0) {
			num = 0;
		}
			for(int i = 0; i < array.length; i++) {
				num += array[i];
			}
			
			if(num % 2 == 0) {
				return "even";
			}else if(num % 2 != 0) {
				return "odd";
			}
		
		return "";

		  }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oddOrEven(new int[] {0,-1,-5}));

	}

}
