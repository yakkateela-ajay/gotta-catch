package controller;

import java.io.IOException;

import model.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			Bulbasaur b=new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pok�mon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter Pok�mon in the Kanto region.",
					"POISON","IVYSAUR","64");
			msg = "<center>" + b.getPokemonName() + "  #" + b.getPokemonNumber();
			request.setAttribute("message1",b.getPokemonNumber());
			request.setAttribute("character1", b.getCharacteristics());
			request.setAttribute("type1",b.getType());
			request.setAttribute("evolution1",b.getEvolution());
			request.setAttribute("baseExp1", b.getBaseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard c= new Charizard("Charizard",006,"\"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
					"FIRE","CHARMELEON","240");
			
					msg = "<center>" + c.getPokemonName() + "  #" +  c.getPokemonNumber();
					request.setAttribute("message2", c.getPokemonNumber());
					request.setAttribute("character2",c.getCharacteristics());
					request.setAttribute("type2",c.getType());
					request.setAttribute("evolution2", c.getEvolution());
					request.setAttribute("baseExp2",c.getBaseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	

				  
			 Dragonite d=new  Dragonite(" Dragonite",149,"Dragonite is capable of flying faster than the speed of sound.It is a kindhearted Pok�mon with human-like intelligence. It shows signs of altruism.", "DRAGON","DRATINI","270"); 

				msg = "<center>" + d.getPokemonName() + "  #" +  d.getPokemonNumber();
				request.setAttribute("message3",d.getPokemonNumber());
				request.setAttribute("character3", d.getCharacteristics());
				request.setAttribute("type3",d.getType());
				request.setAttribute("evolution3",d.getEvolution());
				request.setAttribute("baseExp3", d.getBaseExp());
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
	
			Mew m=new Mew("Mew",151,"Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
					"PSYCHIC","NONE","64");

			msg = "<center>" + m.getPokemonName() + "  #" +  m.getPokemonNumber();
			request.setAttribute("message4",m.getPokemonNumber());
			request.setAttribute("character4",m.getCharacteristics());
			request.setAttribute("type4",m.getType());
			request.setAttribute("evolution4", m.getEvolution());
			request.setAttribute("baseExp4", m.getBaseExp());
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
			
			Pikachu p=new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise mascot.",
					"ELECTRIC","RAICHU","112");

			msg = "<center>" + p.getPokemonName() + "  #" +  p.getPokemonNumber();
			request.setAttribute("message5",p.getPokemonNumber());
			request.setAttribute("character5",p.getCharacteristics());
			request.setAttribute("type5",p.getType());
			request.setAttribute("evolution5",p.getEvolution());
			request.setAttribute("baseExp5", p.getBaseExp());

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
