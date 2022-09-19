package test;

public class ReverseString {
	
	
	 public static char getGrade(int s1, int s2, int s3) {
	      
	      int score = (s1 + s2 + s3) /3;
	      char letter;
	      System.out.println(score);
	      if( score >= 90 || score == 100){
	        return letter = 'A';
	      }else if( score >= 80) {
	        return letter = 'B';
	      }
	      else if(score >= 70) {
	        return letter = 'C';
	      }
	      else if(score >= 60) {
	        return letter = 'D';
	      }else {
	      return letter = 'F';
	      
	}

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "hello";
		String word2 = "hellos";
		String reverse = new StringBuilder(word).reverse().toString();
		
		System.out.println(reverse);
		
		char [] in = word2.toCharArray();
		int begin=0;
		int end= in.length-1;
		char temp;
		while(end>begin) {
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
		}
		
		System.out.println(getGrade(82,85,87));
		
	
		

	}

}
