package coding;

public class RemoveSpacesMiddle {
	public static void main(String[] args) {
		String s="This       is   a        $symbol";
		char[] c=s.toCharArray();
		String str="";
		for (int i = 0; i < c.length; i++) {
			if (c[i]==' ' && c[i+1]!=' '|| c[i]!=' ') {
				str+=c[i];
			}
			
			
		}
		System.out.println(str);
		
		
	}

}
