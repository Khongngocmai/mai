package exercise3;

public class Rectangle extends Shape {

	private double with;
	private double length;
	
	public Rectangle(String color, boolean filled, double with, double length) {
		super(color, filled);
		this.with = with;
		this.length = length;
	}

	public double getWith() {
		return with;
	}

	public void setWith(double with) {
		this.with = with;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() { 
		return "Rectangle [color: "+ getColor()+"filled:  "+isFilled()+ "with=" + with + ", length=" + length + "]";
	}

	@Override
	public double getArea() {
		return with*length;
	}

	@Override
	public double getPerimeter() {
		
		return 2*(with+length);
	}
	
	
}
