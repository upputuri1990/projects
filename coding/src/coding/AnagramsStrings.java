package coding;



public class AnagramsStrings {
	public static void main(String[] args) {
	
		String s1="listen";
		String s2="silence";
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (c1[i]==c2[j]) {
					System.out.println("Two strings are  anagrams");
					
				}
				else 
				{
					System.out.println("not anagrams");
				}
					
				
				
			}
			
		}
	}

}
