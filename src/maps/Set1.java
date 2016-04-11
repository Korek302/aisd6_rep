package maps;

import java.util.ArrayList;
import java.util.List;


public class Set1 implements Set
{
	List<String> list;
	
	public Set1()
	{
		list = new ArrayList<String>();
	}
	
	public void add(String value)
	{
		if(contains(value))
			return;
		else
			list.add(value);
	}

	public boolean contains(String value)
	{
		boolean out = false;
		for(String s: list)
		{
			if(s == value)
			{
				out = true;
				break;
			}
		}
		return out;
	}

	public void remove(String value)
	{
		for(String s: list)
		{
			if(s == value)
			{
				list.remove(value);
				break;
			}
		}
	}

	public void clear()
	{
		list.clear();
	}

	public int size()
	{
		return list.size();
	}

	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public String toString()
	{
		String out = "[";
		for(String l: list)
		{
			out += l+", ";
		}
		if(out.length() > 2)
		{
			out = out.substring(0, out.length()-2);
		}	
		out += "]";
		return out;
	}
	
}
