package testing;
import model.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestBulbasaur {
	@Test
	public void testCharacteristicsMethod() {
	
		Bulbasaur p = new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.",
				"POISON","IVYSAUR","64");
		String temp = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.";
		assertEquals(temp,p.getCharacteristics());		
		try {
	
			Bulbasaur p1 = new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.",
					"POISON","IVYSAUR","64");
			temp = null;
			p1.getCharacteristics();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTypeMethod() {
		Bulbasaur p = new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.",
				"POISON","IVYSAUR","64");
		String temp = "POISON";
		assertEquals(temp,p.getType());		
		try {
			Bulbasaur p1 = new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.",
					"POISON","IVYSAUR","64");
			temp = null;
			p1.getType();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEvolutionMethod() {
		Bulbasaur p = new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.",
				"POISON","IVYSAUR","64");
		String temp = "IVYSAUR";
		assertEquals(temp,p.getEvolution());		
		try {
			Bulbasaur p1 = new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.",
					"POISON","IVYSAUR","64");
			temp = null;
			p1.getEvolution();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBaseExpMethod() {
		Bulbasaur p = new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.",
				"POISON","IVYSAUR","64");
		String temp = "64";
		assertEquals(temp,p.getBaseExp());		
		try {
			Bulbasaur p1 = new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.",
					"POISON","IVYSAUR","64");
			temp = null;
			p1.getBaseExp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}