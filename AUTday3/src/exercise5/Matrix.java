package exercise5;

public class Matrix {

		private int rows;
		private int columns;
		private int [][] elements;
		

		public Matrix(int row, int columns) {
			this.rows = row;
			this.columns = columns;
			this.elements = new int [rows][columns];
		}


		

		public void setElements(int [][] elements) {
			if (elements.length != rows || elements[0].length != columns) {
	            System.out.println("Invalid matrix dimensions. Elements not set.");
	            return;
	        }
	        this.elements = elements;
		}
		
		 public int[][] getElements() {
		        return elements;
		    }

		 public void printMatrix() {
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                System.out.print(elements[i][j] + "\t");
		            }
		            System.out.println();
		        }
		    }

}
