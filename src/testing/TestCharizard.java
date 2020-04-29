package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Charizard;


////tests for charlizard
public class TestCharizard {
	public void testCharacteristicsMethod() {
		Charizard p = new Charizard("Charizard",006,"\"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
				"FIRE","CHARMELEON","240");
		String temp = "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
		assertEquals(temp,p.getCharacteristics());		
			try {
				Charizard p1 = new Charizard("Charizard",006,"\"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
						"FIRE","CHARMELEON","240");
				temp = null;
			p1.getCharacteristics();
	}
		catch(Exception e) {
				e.printStackTrace();
			}
		}

		@Test
		public void testTypeMethod() {
			Charizard p = new Charizard("Charizard",006,"\"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
					"FIRE","CHARMELEON","240");
			String temp = "FIRE";
			assertEquals(temp,p.getType());		
			try {
				Charizard p1 = new Charizard("Charizard",006,"\"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
					"FIRE","CHARMELEON","240");
				temp = null;
				p1.getType();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}



public void testEvolutionMethod() {
	Charizard p = new Charizard("Charizard",006,"\"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
			"FIRE","CHARMELEON","240");
	String temp = "CHARMELEON";
	assertEquals(temp,p.getEvolution());		
try {
		Charizard p1 = new Charizard("Charizard",006,"\"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
				"FIRE","CHARMELEON","240");
		temp = null;
		p1.getEvolution();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}

@Test
public void testBaseExpMethod() {
	Charizard p = new Charizard("Charizard",006,"\"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
			"FIRE","CHARMELEON","240");
	String temp = "240";
	assertEquals(temp,p.getBaseExp());		
	try {
	Charizard p1 = new Charizard("Charizard",006,"\"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
			"FIRE","CHARMELEON","240");
		temp = null;
		p1.getBaseExp();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
} 