package application;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) 
	{
		List <String> list = new ArrayList<>();// lista n?o aceita tipo primitos, ? necess?rio usar a wrapper class. Nesse caso a Integer

		list.add("Maria");
		list.add("Alex");
		list.add("Ana");
		list.add(2, "Joao");
		
		System.out.println(list.size());
		
		list.remove("Ana");
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		
	}

}
