package coding;

public class PalendromeString {
	public static void main(String[] args) {
		String str="aaabaaa";
		String reverse="";
		
		char[] c=str.toCharArray();
		for (int i = c.length-1; i >=0; i--) {
			reverse +=c[i];
			
			
			
		}
		System.out.println(reverse);
		if (str.equals(reverse)) {
			System.out.println("string is palendrome");
			
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
			
		}
	}


