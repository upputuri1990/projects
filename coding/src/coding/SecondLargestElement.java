package coding;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] a= {2,12,45,34,67};
		//find maximum element in an array
		int max=a[0];
		int secondMax=a[0];
		 
		int index=0;
		@SuppressWarnings("unused")
		int secondMaxIndex=0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				secondMax=max;
				
				max=a[i];
				index=i;
				
		}
			else if (a[i]>secondMax) {
				
				secondMax=a[i];
				
				
				
			}
			
			
			
		}
		System.out.println("maximum element in an array is :" +max);
		System.out.println("index of maximum element in an array is :" +index);
		System.out.println("second maximum element in an array is :" +secondMax);
		
		
		
		
	}

}
