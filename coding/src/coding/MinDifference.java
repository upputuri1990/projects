package coding;

public class MinDifference {
	public static void main(String[] args) {
		int[] a= {1,100,5,64,86,35};
		int diff=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
			
			if (Math.abs((a[i]-a[j]))<diff) {
				diff=Math.abs((a[i]-a[j]));
				
				
			}
			}
			
		}
		System.out.println(diff);
		
	}

}
