
public class Dog extends Animal {
	private String pasmina;
	
	public Dog(String ime, int numLegs){
		super(ime, numLegs, "dog" );
		this.pasmina = "nepoznata";
		System.out.println("Dog const");
	}
	
	public Dog(String ime, int numLegs, String pasmina){
		super(ime, numLegs, "dog" );
		this.pasmina = pasmina;
	}
	
	
	public String oglasavanje(){
		return "av av";
	}
	
	public String getPasmina() {
		return pasmina;
	}

	public void setPasmina(String pasmina) {
		this.pasmina = pasmina;
	}

	public int testAnimal(){
		return this.getNumLegs();
	}
	
	@Override
	public String toString(){
		return "Pas "+getName();
	}

}
