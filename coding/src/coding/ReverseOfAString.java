package coding;

public class ReverseOfAString {
	public static void main(String[] args) {
		String s="naveen kumar";
		//String str="";
		char[] c=s.toCharArray();
		for (int i = c.length-1; i >=0; i--) {
			//str+=s.charAt(i);
			//char c=s.charAt(i);
			//System.out.println(c);
			System.out.println(c[i]);
			
			
		}
		//System.out.println(str);
	}

}
