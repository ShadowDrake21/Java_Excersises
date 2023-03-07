package seasons;

public enum Seasons {
	WINTER("����", -3), 
	SPRING("�����", 10), 
	SUMMER("����", 22) {
		@Override 
		public String getDescription() {
			return "������ ����� ����";
		}
	}, 
	AUTUMN("�����", 7);

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
		return "�������� ����� ����";
	}
}
