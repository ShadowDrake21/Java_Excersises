package instrument;

public class TestInstrument {

	public static void main(String[] args) {
		Instrument[] instruments = {new Drum("�������"), new Guitar(6), new Trumpet(10.4), new Guitar(7), new Trumpet(8)};
		
		for(Instrument instrument : instruments) {
			instrument.play();
		}
	}

}
