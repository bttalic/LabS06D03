
public class AnimalTest {

	public static void main(String[] args){
		
		Animal dog = new Animal("Rex", 4, "dog");
		Animal cat = new Animal("Molly", 4, "cat");
		Animal bird = new Animal("Tweety", 2, "bird");
		
		System.out.println(dog.toString());
		System.out.println(cat.toString());
		System.out.println(bird.toString());
		
		Dog dog2 = new Dog("Boby", 4);
		System.out.println(dog2.toString());
		
		Animal dog3 = new Dog("Lesi", 4);
		System.out.println(dog3.toString());
		
		Animal a = new Animal("Sapi", 4, "dog");
		Animal dog4 = (Animal)dog3;
		
		System.out.println(dog4.toString());
		System.out.println(dog4 instanceof Animal);
		System.out.println(a instanceof Dog);
		System.out.println(dog3 instanceof Dog);
		System.out.println(dog2 instanceof Animal);
		
		System.out.println(dog2.oglasavanje());
		/*try{
		System.out.println(dog.oglasavanje());
		System.out.println(dog3.oglasavanje());
		System.out.println(dog4.oglasavanje);
		} catch(Exception e){
			System.out.println(e.getMessage());
		}*/
		
	}
}
