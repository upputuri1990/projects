package coding;

public class OccuranceOfEachCharacter {
	public static void main(String[] args) {
		String str="naveen";
		int count=0;
		char[] c=str.toCharArray();
		for(char repeteted : c) {
			System.out.println(repeteted);
			if (repeteted=='e') {
				count++;
			}
		}
		System.out.println("The the occurance of character s is :" +count+ "times"); 
	}
}
