package seasons;

public class TestSeasons {


	public static void main(String[] args) {
		Seasons season  = Seasons.SUMMER;
		System.out.println("���������� ��� ������� ����� ����: " + season.getTitle());
		loveSeason(season);
		System.out.println("=================================");
		printAllInfo();
	}

	public static void loveSeason(Seasons season) {
		switch(season) {
		case WINTER :
			System.out.println("� ����� ����");
			break;
		case SPRING :
			System.out.println("� ����� �����");
			break;
		case SUMMER :
			System.out.println("� ����� ����");
			break;
		case AUTUMN :
			System.out.println("� ����� �����");
			break;
		}
	}
	
	public static void printAllInfo() {
		for(Seasons season : Seasons.values()) {
			System.out.println("����� ����: " + season.getTitle() + ", ������� �����������: "  + season.getTemperature() + ", ��������: ");
			loveSeason(season);
		}
	}
}
