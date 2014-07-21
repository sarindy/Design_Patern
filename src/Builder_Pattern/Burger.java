package Builder_Pattern;

public abstract class Burger implements Item {

	public Packing packing() {

		return new Wrapper();
	}

	public abstract String name();

	public abstract float price();

}
