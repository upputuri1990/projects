package coding;

import java.util.Iterator;
import java.util.LinkedList;

public class AnagramsStrings {
	public static void main(String[] args) {
	LinkedList list=new LinkedList<>();
	list.add(10);
	list.addFirst(5);
	Iterator itrator=list.iterator();
	while (itrator.hasNext()) {
		int data = (int) itrator.next();
		System.out.println(data);
		
	}
		String s1="listen";
		String s2="silent";
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
