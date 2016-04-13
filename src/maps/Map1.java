package maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Map1 implements Map
{
	private class ListElement
	{
		String key;
		int value;
		
		public ListElement(String k, int v)
		{
			key = k;
			value = v;
		}
		
		String getKey()
		{
			return key;
		}
		
		int getValue()
		{
			return value;
		}
		
		public String toString()
		{
			return key+" "+value;
		}
	}
	
	List<ListElement> list;
	
	public Map1()
	{
		list = new ArrayList<ListElement>();
	}

	public int get(String key)
	{
		int out = -1;
		for(ListElement l: list)
		{
			if(l.getKey() == key)
			{
				out = l.getValue();
				break;
			}
		}
		return out;
	}

	public void put(String key, int value)
	{
		boolean exist = false;
		for(ListElement l: list)
		{
			if(l.getKey() == key)
			{
				l.value = value;
				exist = true;
				break;
			}
		}
		if(!exist)
			list.add(new ListElement(key, value));
	}

	public boolean containsKey(String key)
	{
		boolean out = false;
		for(ListElement l: list)
		{
			if(l.getKey() == key)
			{
				out = true;
				break;
			}
		}
		return out;
	}

	public int remove(String key)
	{
		int out = -1;
		for(ListElement l: list)
		{
			if(l.getKey() == key)
			{
				out = l.value;
				list.remove(l);
				break;
			}
		}
		return out;
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
	
	public Iterator<String> keyIterator()
	{
		List<String> k = new ArrayList<String>();
		for(ListElement l: list)
		{
			k.add(l.getKey());
		}
		return k.iterator();
	}
	
	public Iterator<Integer> valueIterator()
	{
		List<Integer> v = new ArrayList<Integer>();
		for(ListElement l: list)
		{
			v.add(l.getValue());
		}
		return v.iterator();
	}
	
	public String toString()
	{
		String out = "[";
		for(ListElement l: list)
		{
			out += l.toString()+", ";
		}
		if(out.length() > 2)
		{
			out = out.substring(0, out.length()-2);
		}	
		out += "]";
		return out;
	}
}
