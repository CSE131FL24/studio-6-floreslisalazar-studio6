package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
			if (n == 0) {
				return 0.0;
			}
			if (n == 1) {
				return 0.5;
			}
			
			else {
					return Math.pow(0.5, n) + geometricSum(n-1);
			}
				
			// FIXME compute the geometric sum for the first n terms recursively
			
			
								
	}
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
			if (radiusMinimumDrawingThreshold == 1) {
				StdDraw.circle(xCenter, yCenter, radiusMinimumDrawingThreshold);
				return;
			}
			else {
				double r = radiusMinimumDrawingThreshold;
				double x = xCenter;
				double y = yCenter;
				//every circle has the same radius
				double radius_new = r/2;
				//circle 1
				double X_circle1 = x - r;
				double Y_Circle1 = y - r;
				//circle 2
				double X_circle2 = x + r;
				double Y_Circle2 = y - r;
				//circle 3
				double X_circle3 = x - r;
				double Y_Circle3 = y + r;
				//circle 3
				double X_circle4 = x + r;
				double Y_Circle4 = y + r;
				
				
				StdDraw.circle(X_circle1, Y_Circle1, radius_new);
				StdDraw.circle(X_circle2, Y_Circle2, radius_new);
				StdDraw.circle(X_circle3, Y_Circle3, radius_new);
				StdDraw.circle(X_circle4, Y_Circle4, radius_new);
				circlesUponCircles(X_circle1, Y_Circle1, radius_new);
				circlesUponCircles(X_circle2, Y_Circle2, radius_new);
				circlesUponCircles(X_circle3, Y_Circle3, radius_new);
				circlesUponCircles(X_circle4, Y_Circle4, radius_new);
				
				
			}
			
			
		// FIXME
		
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array
			return new int[0];
		
	}
	
	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

}
