package maps;

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
		System.out.println("po usunieciu masla: "+map.toString());
		System.out.println("rozmiar: "+map.size());
		System.out.println("czy pusta: "+map.isEmpty());
		map.clear();
		System.out.println("po wyczyszczeniu: \n"+map.toString());
		System.out.println("czy pusta: "+map.isEmpty());
	}
}
