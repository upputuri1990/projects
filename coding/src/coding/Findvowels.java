package coding;

public class Findvowels {
	public static void main(String[] args) {
		String s="naveen";
		char[] c=s.toCharArray();
		int vowels=0;
		for (char d : c) {
			if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
			{
				vowels++;
				System.out.println(d);
				
			}
				
			
		}
		System.out.println(vowels);
		
	}

}
