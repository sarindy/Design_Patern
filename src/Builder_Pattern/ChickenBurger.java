package Builder_Pattern;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
				return "Chicken Burger";
	}

	@Override
	public float price() {
		
		return 2.5f;
	}

}
