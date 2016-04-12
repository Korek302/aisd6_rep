package maps;

import java.util.Iterator;

public class TestMap
{
	public static void main(String[] args)
	{
		Map1 map = new Map1();
		
		map.put("jajko", 2);
		map.put("maslo", 4);
		map.put("mleko", 8);
		System.out.println(map.toString());
		map.put("jajko", 6);
		System.out.println("po ponownym dodaniu jajka z inna wartoscia: \n"+map.toString());
		System.out.println("maslo: "+map.get("maslo"));
		System.out.println("ser: "+map.get("ser"));
		System.out.println("czy jest ser: "+map.containsKey("ser"));
		System.out.println("czy jest mleko: "+map.containsKey("mleko"));
		map.remove("maslo");
		System.out.println("po usunieciu masla: \n"+map.toString());
		System.out.println("rozmiar: "+map.size());
		System.out.println("czy pusta: "+map.isEmpty());
		map.put("ser", 8);
		System.out.println("dodanie sera: \n"+map.toString());
		System.out.println("iterator po kluczach: ");
		Iterator<String> i1 = map.keyIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("iterator po wartosciach: ");
		Iterator<Integer> i2 = map.valueIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		map.clear();
		System.out.println("po wyczyszczeniu: \n"+map.toString());
		System.out.println("czy pusta: "+map.isEmpty());
		
		
	}
}
