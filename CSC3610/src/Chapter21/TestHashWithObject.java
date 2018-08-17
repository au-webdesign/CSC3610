package Chapter21;

import java.util.HashMap;
import java.util.Scanner;

public class TestHashWithObject {
	public static void main(String[] args) {
	HashMap<Integer, Pokemon> PMap = new HashMap<>();
	
	Pokemon bulb = new Pokemon( 1, "Bulbasaur", "Grass", 100);
	PMap.put( 1, bulb );
	Pokemon ivy = new Pokemon( 2, "Ivysau", "Grass", 200);
	PMap.put( 2, ivy);
	Pokemon venu = new Pokemon( 3, "Venusaur", "Grass", 300);
	PMap.put( 3, venu);
	Pokemon charM = new Pokemon( 4, "Charmander", "Fire", 400);
	PMap.put( 4, charM );
	Pokemon charMeleon = new Pokemon( 4, "CharMelion", "Fire", 500);
	PMap.put( 5, charMeleon );
	Scanner input = new Scanner(System.in);
	int x;
	System.out.print("\nEnter Pokenmon # 1-5");
	x = input.nextInt();
	Pokemon p = PMap.get(x);
	System.out.printf("You selected Num:%s called:%s Ability:%s HP:%s",
	           p.getId(), p.getName(), p.getAbility(), p.getHP() );
	           
}
}
