package All;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class array {

	public static void main(String[] args) {
	
/*	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1);
	a.add(12);

	a.add(13);
a.add(11);
	a.add(11);
System.out.println(a);
	a.remove(2);
	System.out.println(a);
	
	int b=a.size();
	System.out.println(b);*/
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("reena");
		hs.add("sraa");
		hs.add("fraa");
		hs.add("eeraa");
		hs.add("qqraa");
		hs.add("jjraa");
	
		System.out.println(hs);
	Iterator<String> it=	hs.iterator();
	while(it.hasNext()) {
		if(it.equals("reena"))
		{
			System.out.println("reena");
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	}

}
