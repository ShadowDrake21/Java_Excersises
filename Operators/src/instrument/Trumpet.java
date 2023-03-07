package instrument;

public class Trumpet implements Instrument {
	private double diametr;
	
	@Override
	public void play() {
		System.out.println("Играет труба с диаметром " + diametr);
	}

	public Trumpet(double diametr) {
		this.diametr = diametr;
	}

	public double getDiametr() {
		return diametr;
	}

	public void setDiametr(double diametr) {
		this.diametr = diametr;
	}

}
