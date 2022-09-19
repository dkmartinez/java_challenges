package test;

public class Calculadora {
	
	 public static int arithmetic(int a, int b, String operator) {
		    // your code here
		 
		 //operator = operator.toLowerCase();
		 if(operator.equals("add")) {
			return a + b;
		 }else if(operator.equals("substract")){
			 return a - b;
		 }else if(operator.equals("multiply")){
			 return a * b;
		 }else if(operator.equals("divide")){
			 return a / b;
		 }
		 else {
			 return 0;
		 }

	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(arithmetic(1,2,"Substract"));

	}

}
