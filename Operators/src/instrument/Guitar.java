package instrument;

public class Guitar implements Instrument {
	private int stringNumber;
	
	@Override
	public void play() {
		System.out.println("Играет гитара с количеством струн " + stringNumber);
	}

	public int getStringNumber() {
		return stringNumber;
	}

	public void setStringNumber(int stringNumber) {
		this.stringNumber = stringNumber;
	}

	public Guitar(int stringNumber) {
		this.stringNumber = stringNumber;
	}

}
