
public class Krug {

	private Tacka centar;
	private double radius;
	
	
	public Krug(Tacka centar, double radius){
		this.centar = new Tacka(centar);
		this.radius = radius;
	}
	
	public Krug(double x, double y, double radius){
		this.centar = new Tacka(x, y);
		this.radius = radius;
	}
	
	public int isInside(Tacka testna){
		double udaljenost = centar.udaljenost(testna);
		
		if( udaljenost > radius){
			return -1;
		} else if( udaljenost == radius){
			return 0;
		} else {
			return 1;
		}
		
	}
	
	
	public boolean equals(Krug drugi){
		if( this.centar.equals(drugi.centar) && this.radius == drugi.radius )
			return true;
		return false;
	}
	
	public String toString(){
		String krugKaoString = "";
		krugKaoString = "Centar: " + centar.toString() + " Radius: " + radius;
		return krugKaoString;
	}
	
}
