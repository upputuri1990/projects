package coding;

public class PalendromeNumber {
	static int number=412 ;
	static int r;
	static int reverse=0;
	static int temp=number;
	public static void main(String[] args) {
		while (number>0) {
			r=number % 10;
			reverse=(reverse * 10) + r;
			number= number/10;
			
		}
		if (temp ==reverse) {
			System.out.println( reverse +" is  palendrome");
			
		}
		else {
			System.out.println( reverse+ " is  not  palendrome");
			
		}
		
		
		
		
		
	}

}
