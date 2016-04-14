import java.util.*;
public class CircleApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle c = new Circle();
		double r= input.nextDouble();
		c.setRadius(r);
		
		System.out.println(c.getFormattedCircumference());

	}

}
