
public class AnimalTestEx {

	public static void main(String[] args) {
		
		
		Animal a = new Animal ("Animal", 2, "dog");
		Dog d = new Dog("Bobby", 4);
		Animal dr = new Dog("Animal", 2);
		Cat c = new Cat("Molly", 4);
		System.out.println(a.equals(dr));
		System.out.println(a.toString());
		System.out.println(d.toString());
		System.out.println(c.toString());
		
		System.out.println(d.oglasavanje());
		System.out.println(c.oglasavanje());

	}

}
