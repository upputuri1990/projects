package coding;

public class TwoNumbersGivenSum {
public static void main(String[] args) {
	int[] a={2,7,11,15};;
    int sum=18;
    for(int i=0;i< a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
        {
            if(a[i]+a[j]==sum)
            {
                System.out.println("for given sum the two numbers are:"+a[i] +", " +a[j]);
            }
        }
        
    }
	
}
}
