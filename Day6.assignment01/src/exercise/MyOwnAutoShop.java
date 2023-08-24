package exercise;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		Truck truck1 = new Truck(100,2000.0,"Red",20);
		Truck truck2 = new Truck(200,3000.0,"Blue",30);

		Ford ford1 = new Ford(100,2000.0,"balck",2019,20);
		Ford ford2 = new Ford(200,3000.0,"Green",2020,30);
		
		Sedan sedan1 = new Sedan(100,2000.0,"Yellow",20);
		Sedan sedan2 = new Sedan(100,3000.0,"pink",30);
		
		Car[] cars = {truck1,truck2,ford1, ford2,sedan1,sedan2};
		
		System.out.println("Price of all cars: ");
		for (Car car: cars) {
				System.out.println("Sale price: "+car.getSalePrice());
		}
	}
	

}
