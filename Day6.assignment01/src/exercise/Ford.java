package exercise;

public class Ford extends Car {

	private int year;
	private int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(manufacturerDiscount, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	@Override
	public double getSalePrice() {
		
		return regularPrice = regularPrice - manufacturerDiscount;
	}

	
}
