package animals;

public abstract class Animal {
	private String name;
	
	protected abstract void makeNoise();
	protected abstract void eat();
	protected abstract String getDescription();
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
