package mainKlase;

import geometrija.*;

public class Polimorfizam {

	public static void main(String[] args) {
		
		Krug krug=new Krug(new Tacka(6,9), 16);  //oba objekta pravim sa istim parametrima
		Krug krofna=new Krofna();
		Krofna krofnaOrig=new Krofna();
		//Krofna krugKrofna=(Krofna) new Krug(); ClassCastException
		
		System.out.println(krug.toString() +" i povrsina: " +krug.povrsina());
		
		System.out.println(krofna.toString() +" i povrsina: " +krofna.povrsina());
		
		System.out.println(krofna.typeToString());
		
		System.out.println(krofnaOrig.typeToString());
		
		System.out.println(krofna.getClass().getName());
		System.out.println(krofnaOrig.getClass().getName());
		System.out.println(krofna instanceof Krofna);
		
	
		System.out.println(krofnaOrig instanceof Krofna);
		
	}
}
