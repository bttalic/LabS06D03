
public class Cat extends Animal {
	
	public Cat(String ime, int numLegs){
		super(ime, numLegs, "cat");
	}
	
	public String oglasavanje(){
		return "mau";
	}
	public String toString(){
		return "Macka: "+getName();
	}

}
