package coding;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		int[] a= {1,4,5,2,7,3,8,8,8};
		int j=0;
		
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
				a[j++]=a[a.length-1];
				System.out.println(a[i]);
			}
			
			
		}
		
		
				
			
			
		}
		
		

				
			}
			
		
		
			
		
		
		
		
	


