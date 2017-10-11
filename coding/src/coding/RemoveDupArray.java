package coding;

public class RemoveDupArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,4,5,6,6,6};
		int count=0;
		
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]==a[i+1])
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
