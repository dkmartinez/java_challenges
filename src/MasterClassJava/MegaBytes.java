package MasterClassJava;

public class MegaBytes {
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		
		int op = kiloBytes / 1024;
		int res = kiloBytes -(1024 * op) ;
		
		
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
		}else {
			System.out.println(kiloBytes + " KB = " + op + " MB and " + res + " KB");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(5000);
		 printMegaBytesAndKiloBytes(-1024);
	}

}
