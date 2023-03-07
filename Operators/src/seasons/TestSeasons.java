package seasons;

public class TestSeasons {


	public static void main(String[] args) {
		Seasons season  = Seasons.SUMMER;
		System.out.println("»нформаци€ про любимое врем€ года: " + season.getTitle());
		loveSeason(season);
		System.out.println("=================================");
		printAllInfo();
	}

	public static void loveSeason(Seasons season) {
		switch(season) {
		case WINTER :
			System.out.println("я люблю зиму");
			break;
		case SPRING :
			System.out.println("я люблю весну");
			break;
		case SUMMER :
			System.out.println("я люблю лето");
			break;
		case AUTUMN :
			System.out.println("я люблю осень");
			break;
		}
	}
	
	public static void printAllInfo() {
		for(Seasons season : Seasons.values()) {
			System.out.println("¬рем€ года: " + season.getTitle() + ", средн€€ температура: "  + season.getTemperature() + ", описание: ");
			loveSeason(season);
		}
	}
}
