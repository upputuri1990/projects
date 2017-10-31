package coding;

public class MaximumOccuranceOfcharacter {
	static final int ASCII_SIZE = 256;
    static char getMaxOccuringChar(String str)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];
      
        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i=0; i<len; i++)
        {
        char  ch=str.charAt(i);
            count[ch]++;
        }
      
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
      
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        return result;
    }
	public static void main(String[] args) {
		String str = "sample string";
        System.out.println("Max occurring character is " +
                            getMaxOccuringChar(str));
		}
		
		
		
	
	}
	
		
		
			
			
		
		
		
	


