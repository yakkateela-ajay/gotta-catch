package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Mew;



//test mew
public class TestMew {
	@Test
	public void testCharacteristicsMethod() {
		Mew p = new Mew("Mew",151,"Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
				"PSYCHIC","NONE","64");
		String temp = "Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
		assertEquals(temp,p.getCharacteristics());		
		try {
			Mew p1 = new Mew("Mew",151,"Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
					"PSYCHIC","NONE","64");


	     temp = null;
			p1.getCharacteristics();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testTypeMethod() {
		Mew p = new Mew("Mew",151,"Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
				"PSYCHIC","NONE","64");
		String temp = "PSYCHIC";
		assertEquals(temp,p.getType());		
	try {
			Mew p1 = new Mew("Mew",151,"Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
					"PSYCHIC","NONE","64");
			temp = null;
			p1.getType();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testEvolutionMethod() {
		Mew p = new Mew("Mew",151,"Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
				"PSYCHIC","   NONE  ","64");
		String temp = "   NONE  ";
		assertEquals(temp,p.getEvolution());		
		try {
			Mew p1 = new Mew("Mew",151,"Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
					"PSYCHIC","   NONE  ","64");
			temp = null;
			p1.getEvolution();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testBaseExpMethod() {
		Mew p = new Mew("Mew",151,"Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
				"PSYCHIC","NONE","64");
		String temp = "64";
		assertEquals(temp,p.getBaseExp());		
		try {
			Mew p1 = new Mew("Mew",151,"Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
					"PSYCHIC"," NONE","64");
		temp = null;
			p1.getBaseExp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
} 