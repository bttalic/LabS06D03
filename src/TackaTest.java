
public class TackaTest {

	public static void main(String[] args){
		
		Tacka t1 = new Tacka();
		Tacka t2 = new Tacka(1, 1);
		Tacka t3 = new Tacka(t2);
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t3));
		
		System.out.println(t1.udaljenost(t2));
		System.out.println(t2.udaljenost(t3));
		
		
		
	}
}
