package septembersix;

public class test_delete {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Custom string input
        String str = "1 -5 4 6 243";
        String [] arr = str.split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
        	int number = Integer.parseInt(arr[i]);
        	if(number > max) {
        		max = number;
        	}
        	if(number < min) {
        		min = number;
        	}
        	
        	
        }
      
        String max1 = String.valueOf(max);
        String min1 = String.valueOf(min);
        
        System.out.println("The min: " + min1 + " te max" + max1);
        
        // Converting string into an array for computation
//        char arr[] = str.toCharArray();
// 
//        // Nested loops for comparison of characters
//        // in above character array
//       
//        char temp;
// 
//        int i = 0;
//        while (i < arr.length) {
//            int j = i + 1;
//            while (j < arr.length) {
//                if (arr[j] < arr[i]) {
//                   
//                    // Comparing the characters one by one
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//                j += 1;
//            }
//            i += 1;
//        }
// 
//        // By now loop is done means we have
//        // iterated the whole array
//        System.out.println(arr);
//        
        
        
	}

}
