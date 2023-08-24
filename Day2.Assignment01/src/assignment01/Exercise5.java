package assignment01;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("n=");
		int n = scanner.nextInt();
		
		  double naturalLog = computeNaturalLog(n);

	        System.out.println("The natural logarithm of 2 : " + naturalLog);

	        scanner.close();
	    }

	    public static double computeNaturalLog(int n) {
	        double sum = 0.0;

	        for (int i = 1; i <= n; i++) {
	            double term = 1.0 / i;
	            if (i % 2 == 0) {
	                sum -= term;
	            } else {
	                sum += term;
	            }
	        }

	        return sum;
	    }
	    /* double sum = 0;
	     * for(int i=1; i<=n; i++);{
	     * sum += Math.pow(-1, i-1)/i;
	     * }
	     * System.out.println(sum);
	     */
}
