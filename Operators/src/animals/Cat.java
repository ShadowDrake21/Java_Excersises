package animals;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	protected void makeNoise() {
		System.out.println("Meow");
	}

	@Override
	protected void eat() {
		System.out.println("Beef, turkey, chicken");
	}

	@Override
	protected String getDescription() {
		return "A cat is a furry animal that has a long tail and sharp claws. Cats are often kept as pets. \n"
				+ "Cats are lions, tigers, and other wild animals in the same family.\n";
	}

}
