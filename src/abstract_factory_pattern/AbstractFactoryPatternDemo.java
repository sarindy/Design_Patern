package abstract_factory_pattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory=FactoryProducer.getFactory("shape");
		
		Shape shape1=shapeFactory.getShape("circles");
		shape1.draw();
		
		AbstractFactory colorFactory=FactoryProducer.getFactory("color");
		
		Color color1=colorFactory.getColor("red");
		color1.fillColor();
		

	}

}
