package exercise;

public abstract  class Car {

	public int speed;
	public double regularPrice;
	public String color;
	
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Car(int speed, double regularPrice, String color) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}



	public abstract double getSalePrice();
}
