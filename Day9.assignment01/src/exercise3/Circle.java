package exercise3;

public class Circle extends Shape{

	

	private double radius;

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [color: "+ getColor()+"filled:  "+isFilled()+"radius=" + radius + "]" ;
	}

	@Override
	public double getArea() {
		
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		
		return 2 * Math.PI * radius;
	}
	
	
}
