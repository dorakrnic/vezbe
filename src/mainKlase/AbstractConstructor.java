package mainKlase;

import geometrija.*;

public class AbstractConstructor {

	public static void main(String[] args) {
		
		Nasledna nasledna=new Nasledna();
		nasledna.abstrMethod();
		
		AbstractN naslednaAbstract;
		naslednaAbstract=new AbstractN(){

			public void abstrMethod() {
				// TODO Auto-generated method stub
				System.out.println("pojam");
			}
			
		};
		naslednaAbstract.abstrMethod();

	}

}
