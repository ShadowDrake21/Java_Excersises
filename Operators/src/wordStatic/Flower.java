package wordStatic;

public class Flower {
	
	public Flower(String country, int shelfLife, double price) {
		this.country = country;
		this.shelfLife = shelfLife;
		this.price = price;
	}
	
	private String country;
	private int shelfLife;
	private double price;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getShelfLife() {
		return shelfLife;
	}
	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
