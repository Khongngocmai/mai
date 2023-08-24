package exercise5;

public class Main {

	public static void main(String[] args) {
		int[][] data = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        Matrix matrix = new Matrix(3, 3);
	        matrix.setElements(data);

	        System.out.println("Các phần tử của ma trận:");
	        matrix.printMatrix();
	    }

}
