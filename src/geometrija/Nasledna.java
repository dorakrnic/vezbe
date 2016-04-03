package geometrija;

public class Nasledna extends AbstractC{

	public Nasledna(){
		System.out.println("nasledna sam ja! kreiram se kroz abstraktnu klasu");
	}

	@Override
	public void abstrMethod() {
		System.out.println("moram da implementiram abstraktne metode iz super klase");
		
	}
	
	
}
