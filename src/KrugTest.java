
public class KrugTest {
	
	public static void main(String[] args){
		
		Krug k1 = new Krug(0, 0, 2);
		Krug k2 = new Krug(new Tacka(1,1), 3);
		
		Tacka test = new Tacka(1, 0);
		Tacka test2 = new Tacka(2, 0);
		Tacka test3 = new Tacka(3, 0);
		
		System.out.println(k1.toString());
		System.out.println(k1.equals(k2));
		
		System.out.println(k1.isInside(test));
		System.out.println(k1.isInside(test2));
		System.out.println(k1.isInside(test3));
		
		
	}

}
