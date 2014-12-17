
public class Tacka {

	private double x;
	private double y;
	
	public Tacka(){
		this(0, 0);
	}
	
	public Tacka(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Tacka(Tacka druga){
		this.x = druga.x;
		this.y = druga.y;
	}
	
	public double udaljenost(Tacka druga){
		double xUdaljenost = (this.x - druga.x);
		xUdaljenost *= xUdaljenost;
		double yUdaljenost = this.y - druga.y;
		yUdaljenost *= yUdaljenost;
		
		double udaljenost = Math.sqrt( xUdaljenost + yUdaljenost  );
		return udaljenost;
	}
	
	public boolean equals(Tacka druga){
		if(this.x == druga.x && this.y == druga.y)
			return true;
		
		return false;
	}
	
	public String toString(){
		String tackaKaoString = "";
		tackaKaoString = "( " + this.x + ", " + this.y + " )";
		return tackaKaoString;
	}
}
