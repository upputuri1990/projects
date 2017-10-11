package coding;

import java.util.HashSet;

public class DuplicateElements {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,3,2,6,5,6,6};
		int count=0;
		//O(n^2) method 
		/*for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
					System.out.println("duplicate elements in an array are :" +a[j]);
					
				
			}
			
			
		}*/
		HashSet<Integer> hashSet=new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (hashSet.add(a[i])==false) {
				count++;
				System.out.println("duplicate elemnts in an array is: " +a[i]);
				
				
			}
			
			
		}
		System.out.println("The number of repetited elements in an array is :"+count);
		
		
	}

}
