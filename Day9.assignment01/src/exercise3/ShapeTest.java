package exercise3;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circle = new Circle("red", true,5.0);
		Rectangle rectangle = new Rectangle("green",false,5.6,3.4);
		Square square = new Square("pink ", true, 3.6,2.9,5.8);
		
		System.out.println(circle);
		System.out.println("Area:" + circle.getArea());
		System.out.println("Perameter: "+circle.getPerimeter());
		
		System.out.println(rectangle);
		System.out.println("Area:" + rectangle.getArea());
		System.out.println("Perameter: "+rectangle.getPerimeter());
		
		System.out.println(square);
		System.out.println("Area:" + square.getArea());
		System.out.println("Perameter: "+square.getPerimeter());
	}

}
