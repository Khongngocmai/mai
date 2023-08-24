package exercise3;

public class Square extends Rectangle{

	private double side;

	

	public Square(String color, boolean filled, double with, double length, double side) {
		super(color, filled, with, length);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
		setWith(side);
		setLength(side);
	}

	@Override
	public String toString() {
		return "Square [color: "+getColor()+"filled: "+isFilled()+"with= "+getWith()+"length= "+getLength()+"side=" + side + "]";
	}
	
	
	public void setWith(double side) {
		
		super.setWith(side);
		super.setLength(side);
	} 
	public void setLength(double side) {
		super.setWith(side);
		super.setLength(side);
	}
}
