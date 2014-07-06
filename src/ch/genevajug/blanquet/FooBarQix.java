package ch.genevajug.blanquet;

import java.util.HashMap;
import java.util.Map;

public class FooBarQix {
	
	public static void main(String[] args) {
		// Le hash d'un entier c'est lui même donc c'est tout bon pour l'ordre
		Map<Integer, String> codes = new HashMap<Integer, String>();
		codes.put(3, "Foo");
		codes.put(5, "Bar");
		codes.put(7, "Qix");

		for (Integer nombre = 1; nombre <= 100; nombre++) {
			StringBuilder travailFait = new StringBuilder();
			String sNombre = nombre.toString();
			
			for (Integer diviseur : codes.keySet()) {
				if (nombre % diviseur == 0)
					travailFait.append(codes.get(diviseur));
			}
			
			for (int index = 0; index < sNombre.length(); index++) {
				Integer contenu = Integer.valueOf(sNombre.substring(index, index + 1));
				if (codes.containsKey(contenu))
					travailFait.append(codes.get(contenu));
			}
			
			if (travailFait.length() > 0)
				sNombre = travailFait.toString();
			
			System.out.println(sNombre);
		}
	}

}
