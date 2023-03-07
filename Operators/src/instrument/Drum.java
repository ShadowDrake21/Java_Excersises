package instrument;

public class Drum implements Instrument {
	private String size;
	
	@Override
	public void play() {
		System.out.println("Играет барабан размером " + size);
	}

	public Drum(String size) {
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
