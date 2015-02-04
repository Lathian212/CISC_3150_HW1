import java.math.*;

public class Circle {
	// Techniques for comparing floats for equality from:
	// http://www.java2s.com/Code/Java/Collections-Data-Structure/Twodoublevaluearraysarealmostequal.htm
	
	private static final double EPSILON = 0.00001;
	private double radius = 0.0;
	private double XCord = 0.0;
	private double YCord = 0.0;
	
	Circle(double radius, double XCord, double YCord) {
		this.radius = radius;
		this.XCord = XCord;
		this.YCord = YCord;
	}
	public void containsStatus(Circle c2) {
		double distCent = distPoints(this.XCord, c2.XCord, this.YCord, c2.YCord);
		double smallRadius = 0.0;
		double bigRadius = 0.0;
		if (this.radius < c2.radius){
			smallRadius = this.radius;
			bigRadius = c2.radius;
		}
		else {
			smallRadius = c2.radius;
			bigRadius = this.radius;
		}
		if (distCent > (smallRadius + bigRadius)) {
			System.out.println("The two circles are not touching");
		}
		// Below is test for float equality
		// Testing if the circles are basically at the same co-ordinates and they have
		// within EPSILON radi then they are superimposed
		else if ((distCent < EPSILON) && Math.abs(smallRadius-bigRadius) < EPSILON ){
			System.out.println("The two circles are superimposed, touching each other");
		}
		// Below branch tests if any overlap or one is completely inside the other.
		// First test if they are touching in anyway
		else if (distCent < (smallRadius + bigRadius)) {
			if ((distCent + smallRadius) <= bigRadius) {
				System.out.println("The smaller circle is completely inside the bigger.");
			}
			else if ((distCent + smallRadius) > bigRadius) {
				System.out.println("The two circles overlap");
			}
		}
		
	}
	// Helper method implementing distance between two co-ordinated points
	private double distPoints(double x1, double x2, double y1, double y2) {
		return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
	}
}