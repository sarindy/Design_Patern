package factory_Patern;

public class ShapeFactory {
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

}
