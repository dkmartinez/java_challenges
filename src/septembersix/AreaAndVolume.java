package septembersix;

public class AreaAndVolume {
	
	
	public static int[] getSize(int w,int h,int d) {
		int [] args = new int[2];
		int formula = 2 * h * w + 2 * d * h + 2 * w * d;
		int area = w * h * d;
		
		args[0] = formula;
		args[1] = area;

		return new int[] {formula, area};
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num []= getSize(4,2,6);
		System.out.println(num[0]);
		getSize(1,1,1);
		
		

	}

}
