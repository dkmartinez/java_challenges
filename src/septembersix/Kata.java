package septembersix;

public class Kata {
	public static boolean smallEnough(int[] a, int limit)
	  {
		int num = 0;
	    for(int i = 0; i < a.length; i++) {
	    	num = a[i];

	    }
		if(num <= limit) {
    		return true;
    	}else {
    		 return false;
    	}
	   
	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {78, 117, 110, 99, 104, 117, 107, 115};
		System.out.println(smallEnough(new int[] { 66, 101 }, 200));
		System.out.println(smallEnough(arr, 100));
		System.out.println(smallEnough(new int[] { 101, 45, 75, 105, 99, 107 }, 107));
		System.out.println(smallEnough(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120));

	}

}
