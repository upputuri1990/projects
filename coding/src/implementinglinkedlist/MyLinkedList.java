package implementinglinkedlist;

public class MyLinkedList{
	Node head,tail;
	public void add(String data)
	{
		Node node=new Node(data);
		if(tail==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			tail.nextNode=node;
			tail=node;
		}
		
	}
	
	
	
			
		
		
	}
	
	
	
	
	
	
	
	
	


