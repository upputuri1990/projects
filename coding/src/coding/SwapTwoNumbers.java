package coding;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int x=25;
		int y=45;
		System.out.println("Before swapping");
		System.out.println(x);
		System.out.println(y);
		
		x=x+y;//x=70
		y=x-y;//70-45=25
		x=x-y;//70-25=45
	
		System.out.println("After swapping");
		System.out.println(x);
		System.out.println(y);
		
	}

}
