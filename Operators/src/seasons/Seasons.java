package seasons;

public enum Seasons {
	WINTER("Зима", -3), 
	SPRING("Весна", 10), 
	SUMMER("Лето", 22) {
		@Override 
		public String getDescription() {
			return "Теплое время года";
		}
	}, 
	AUTUMN("Осень", 7);

	private String title;
	private int temperature;
	
	Seasons(String title, int temperature) {
		this.title = title;
		this.temperature = temperature;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public String getDescription() {
		return "Холодное время года";
	}
}
