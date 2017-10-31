package coding;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Vector;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		
		al1.add("naveen");
		al1.add("sanjai");
		al1.add("kumar");
		int size=al1.size();
		System.out.println(size);
		String element=al1.get(2);
		System.out.println(element);
		String remove=al1.remove(2);
		System.out.println(remove);
		
		
		
		Vector<String> v=new Vector<String>();
		int capacity=v.capacity();
		System.out.println(capacity);
		
		
		LinkedList<String> ll=new LinkedList<>();
		ll.add("babu");
		ll.add("mahesh");
		String llelement=ll.get(1);
		System.out.println(llelement);
		String firstElement=ll.getFirst();
		System.out.println(firstElement);
		
		
		
		
		
		
		
		
		
			
		}
				
	}


