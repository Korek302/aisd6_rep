package maps;

public class TestSet
{
	public static void main(String[] args)
	{
		Set1 set = new Set1();
		
		set.add("jajko");
		set.add("maslo");
		set.add("mleko");
		System.out.println(set.toString());
		set.add("jajko");
		System.out.println("po ponownym dodaniu jajka: \n"+set.toString());
		System.out.println("czy jest ser: "+set.contains("ser"));
		System.out.println("czy jest mleko: "+set.contains("mleko"));
		set.remove("maslo");
		System.out.println("po usunieciu masla: "+set.toString());
		System.out.println("rozmiar: "+set.size());
		System.out.println("czy pusta: "+set.isEmpty());
		set.clear();
		System.out.println("po wyczyszczeniu: \n"+set.toString());
		System.out.println("czy pusta: "+set.isEmpty());
	}
}
