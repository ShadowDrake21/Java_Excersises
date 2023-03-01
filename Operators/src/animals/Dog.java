package animals;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	protected void makeNoise() {
		System.out.println("Bark");
	}

	@Override
	protected void eat() {
		System.out.println("Carrots, fish, chicken");
	}

	@Override
	protected String getDescription() {
		return "The dog is a pet animal. A dog has sharp teeth so that it can eat flesh very easily, \n"
				+ "it has four legs, two ears, two eyes, a tail, a mouth, and a nose.\n"
				+ "It is a very clever animal and is very useful in catching thieves.\n"
				+ "It runs very fast, barks loudly and attacks the strangers.\n";
	}

}
