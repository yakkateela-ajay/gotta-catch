package testing;

import org.junit.Test;

import model.Pikachu;

import static org.junit.Assert.*;



//test pikachu
public class TestPikachu {

	@Test
	public void testCharacteristicsMethod() {
		Pikachu p = new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise mascot.",
				"ELECTRIC","RAICHU","112");
		String temp = "Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise mascot.";
		assertEquals(temp,p.getCharacteristics());		
		try {
			Pikachu p1 = new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise mascot.",
					"ELECTRIC","RAICHU","112");
			temp = null;
			p1.getCharacteristics();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testTypeMethod() {
		Pikachu p = new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise mascot.",
				"ELECTRIC","RAICHU","112");
		String temp = "ELECTRIC";
		assertEquals(temp,p.getType());		
	try {
			Pikachu p1 = new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise mascot.",
					"ELECTRIC","RAICHU","112");
		temp = null;
			p1.getType();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testEvolutionMethod() {
		Pikachu p = new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise mascot.",
				"ELECTRIC","  RAICHU","112");
		String temp = "  RAICHU";
		assertEquals(temp,p.getEvolution());		
		try {
			Pikachu p1 = new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise mascot.",
					"ELECTRIC","  RAICHU","112");
			temp = null;
		p1.getEvolution();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testBaseExpMethod() {
		Pikachu p = new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise mascot.",
				"ELECTRIC","RAICHU","112");
		String temp = "112";
		assertEquals(temp,p.getBaseExp());		
		try {
			Pikachu p1 = new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise mascot.",
					"ELECTRIC","RAICHU","112");
			temp = null;
			p1.getBaseExp();
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
} 