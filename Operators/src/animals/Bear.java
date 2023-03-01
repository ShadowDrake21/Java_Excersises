package animals;

public class Bear extends Animal {

	public Bear(String name) {
		super(name);
	}

	@Override
	protected void makeNoise() {
		System.out.println("Woof");
	}

	@Override
	protected void eat() {
		System.out.println("Fruits, nuts, honey");
	}

	@Override
	protected String getDescription() {
		return "Bears are mammals that belong to the family Ursidae. \n"
				+ "They can be as small as four feet long and about 60 pounds "
				+ "(the sun bear) to as big as eight feet long and more than a thousand pounds (the polar bear)."
				+ " They're found throughout North America, South America, Europe, and Asia.\n";
	}

}
