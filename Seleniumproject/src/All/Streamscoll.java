package All;

import java.util.ArrayList;

public class Streamscoll {
public static void main(String[] args)
{
	
		ArrayList<String> al=new ArrayList<String>();
		al.add("reena");
		al.add("sujayani");
		al.add("ujjaini");
		al.add("goverdhan");
		al.add("reenaaa");
		al.add("rhukeena");
		int count=0;
		for(int i=0;i<al.size();i++)
		{
		String name=	al.get(i);
		
		if(name.startsWith("r"))
		{
			count++;
		}
		System.out.println(count);
		}
	}
		
	}

