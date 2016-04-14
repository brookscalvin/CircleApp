import java.text.DecimalFormat;
import java.util.*;

public class Circle {
	private double radius;
	DecimalFormat df = new DecimalFormat("#.00");

	public double getCircumference() {
		double circumference = 2 * (Math.PI) * radius;
		return circumference;
	}

	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

	public String getFormattedCircumference() {
		return df.format(getCircumference());
	}

	public String getFormattedArea() {
		return df.format(getArea());
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
