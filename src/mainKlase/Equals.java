package mainKlase;

public class Equals {

	public static void main(String[] args) {
		String letter = "o";
		String s = "hello";                      
		String t = "hell" + letter;               
		if (s.equals(t))                         
		  System.out.println("equivalent"); 
		
		byte[] a = { 1, 2, 3 };                  // An array. 
		byte[] b = (byte[]) a.clone();           // A copy with identical content. 
		if (a == b) System.out.println("equal");
		
		
		byte[] buffer = new byte[1024];
		System.out.println(buffer.length);
		System.out.println(buffer[0]);

	}

}
