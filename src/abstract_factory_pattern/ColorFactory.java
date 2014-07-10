package abstract_factory_pattern;

public class ColorFactory extends AbstractFactory {

	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("red")) {
			return new Red();

		}

		if (color.equalsIgnoreCase("green")) {
			return new Green();

		}

		if (color.equalsIgnoreCase("blue")) {
			return new Blue();

		}

		return null;
	}

	Shape getShape(String shape) {

		return null;
	}

}
