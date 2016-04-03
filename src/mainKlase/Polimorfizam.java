package mainKlase;

import geometrija.*;

public class Polimorfizam {

	public static void main(String[] args) {
		
		Krug krug=new Krug(new Tacka(6,9), 16);  //oba objekta pravim sa istim parametrima
		Krug krofna=new Krofna();
		
		System.out.println(krug.toString() +" i povrsina: " +krug.povrsina());
		
		System.out.println(krofna.toString() +" i povrsina: " +krofna.povrsina());
		
		System.out.println(krofna.typeToString());
		
	}
}
