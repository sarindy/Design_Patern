package abstract_factory_pattern;

public class ShapeFactory extends AbstractFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		if (shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		}

		if (shapeType.equalsIgnoreCase("square")) {
			return new Square();
		}

		return null;

	}

	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
