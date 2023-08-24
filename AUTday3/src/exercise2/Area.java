package exercise2;

public class Area {

		public double length;
		public double breadth;
		
		public Area() {
			
		}

		public Area(double length, double breadth) {
			super();
			this.length = length;
			this.breadth = breadth;
		}
		public double returnArea() {
			return(length*breadth);
		}
		
}