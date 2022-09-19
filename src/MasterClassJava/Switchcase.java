package MasterClassJava;

public class Switchcase {
	
	public static boolean isLeapYear (int year) {
		if(year <= 0 || year > 9999) {
			return false;
			
		}else if(year % 100 != 0 && year % 4 == 0  ) {
			return true;
		}

		else if(year % 4 != 0 || year % 100 == 0 && year % 400 != 0 ) {
			return false;
			
		} else {
			return true;
		}
	}
	
	public static int getDaysInMonth(int month, int year) {
		if(month < 0 || year < 0 || year > 9999 ) {
			return -1;
		}else if( month == 2 &&  isLeapYear(year)) {
			return 29;
		}
		switch(month) {
		case 1: return 31;
		case 2: return 28;
		case 3: return 31;
		case 4: return 30;
		case 5: return 31;
		case 6: return 30;
		case 7: return 31;
		case 8: return 31;
		case 9: return 30;
		case 10: return 31;
		case 11: return 30;
		case 12: return 31;
		default: return -1;
		}
	}
	
	public static void printNumberInWord(int x) {
		switch(x) {
		case 0: System.out.println("ZERO");
		break;
		case 1: System.out.println("ONE");
		break;
		case 2: System.out.println("TWO");
		break;
		case 3: System.out.println("THREE");
		break;
		case 4: System.out.println("FOUR");
		break;
		case 5: System.out.println("FIVE");
		break;
		case 6: System.out.println("SIX");
		break;
		case 7: System.out.println("SEVEN");
		break;
		case 8: System.out.println("EIGHT");
		break;
		case 9: System.out.println("NINE");
		break;
		default: System.out.println("OTHER");
		}
	}
		
	public static void printDayOfTheWeek(int day) {
		
//		switch(day) {
//		case 0: System.out.println("Sunday");
//		break;
//		case 1: System.out.println("Monday");
//		break;
//		case 2: System.out.println("Tuesday");
//		break;
//		case 3: System.out.println("Wednesday");
//		break;
//		case 4: System.out.println("Thursday");
//		break;
//		case 5: System.out.println("Friday");
//		break;
//		case 6: System.out.println("Saturday");
//		break;
//		default: System.out.println("Invalid day");
//		}
		
		if(day == 0) {
			System.out.println("Sunday");
		}else if(day ==1 ) {
			System.out.println("Monday");
		}
		else if(day ==2 ) {
			System.out.println("Tuesday");
		}
		else if(day ==3 ) {
			System.out.println("Wednesday");
		}
		else if(day ==4 ) {
			System.out.println("Thursday");
		}
		else if(day ==5 ) {
			System.out.println("Friday");
		}
		else if(day ==6 ) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Invalid day");
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getDaysInMonth(1, 2020));
	
//		char letter = 'E';
//		
//		switch(letter) {
//		case'A': System.out.println("Letter A has been choosen");
//		break;
//		case'B': System.out.println("Letter B has been choosen");
//		break;
//		case'C': System.out.println("Letter C has been choosen");
//		break;
//		case'D': System.out.println("Letter D has been choosen");
//		break;
//		case'E':case 'F': System.out.println("Letter " + letter + " has been choosen");
//		break;
//		default: System.out.println("Not found");
		
//		}

	}

}
