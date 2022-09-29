package MasterClassJava;

import java.util.Scanner;

public class ReadingUserInput {
	
	 public static String getMiddle(String word) {
		 int letter = word.length() / 2;
		 System.out.println(letter);
		 
		 
		  if( word.length() % 2 != 0) {
			  System.out.println(word);
			 return  word.substring(letter, letter+1);
			
			
		  }else {
			  return word.substring(letter-1, letter+1);
		  }
		  
		  }
	 
	 public static int[] invert(int[] array) {
		 
		 for (int i = 0; i < array.length; i++) {
			array[i] = array[i] *-1;
			
		 }
		  
		  return array;
		  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int value = 0;
		
		 
		for(int i = 1; i <= 10; i++) {
			System.out.println("#" + i + " Write a number: ");
			value += scanner.nextInt();
			System.out.println(value);
		
			if(value < 0 && scanner.hasNextInt() == false) {
				System.out.println("Invalid Value");
			}
			//value =+ value;
			
		}
		scanner.close();
		System.out.println("La suma total es: " + value);

	}

}
