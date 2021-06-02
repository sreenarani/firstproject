package All;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class streams {

@Test(enabled=false)
	public void streams()
	{
	
	Stream.of("reena", "rani","deepa","sai").filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
			
	}
	
	@Test(enabled=false)
	public void streamMap()
	{
		Stream.of("reena", "rani","deepa","ujjaini").filter(s->s.endsWith("i")).map(s->s.concat("abc")).forEach(s->System.out.println(s));
	}
	
	@Test(enabled=false)
	public void streamnum()
	{
		Stream.of(1,2,3,4,4,5,5).distinct().forEach(s->System.out.println(s));
	}
	
	@Test(enabled=false)
	public void sort()
		{
		ArrayList<String> al=new ArrayList<String>();
		al.add("reena");
		al.add("sujayani");
		
		
		
		List<String> names=Arrays.asList("ryan", "rzan","rama","raja","rena");
	
		
           Stream<String> newlist=Stream.concat(al.stream(), names.stream());
          // newlist.sorted().forEach(s->System.out.println(s));
           
       boolean flag=    newlist.anyMatch(s->s.equalsIgnoreCase("RYAN"));
       System.out.println(flag);
       Assert.assertTrue(flag);
	}
	
	@Test
	public void collect()
	{
		List<String> ls=Stream.of("anita","banu","canyu","dernb").filter(s->s.endsWith("u")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(1));
		
		
		
	}






}
