package coding;

public class ChildPrivate extends PrivateAccessMembers {
	public static void main(String[] args) {
		
	
	PrivateAccessMembers PAM=new ChildPrivate();
	PAM.setSsn("234-45-56798");
	System.out.println(PAM.getSsn());
	}
	
	

}
