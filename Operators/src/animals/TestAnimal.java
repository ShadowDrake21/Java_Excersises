package animals;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animals[] = new Animal[3];
		Vet vet = new Vet();
		
		animals[0] = new Cat("Cat Tom");
		animals[1] = new Dog("Dog Petro");
		animals[2] = new Cat("Bear Winny");
		
		for(int i = 0; i < animals.length; i++) {
			vet.treatAnimal(animals[i]);
		}
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].makeNoise();
			animals[i].eat();
		}
	}

}
