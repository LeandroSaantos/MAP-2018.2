package PizzaNyBuilder;

public class PizzaNyBuilder extends PizzaBuilder {
	@Override
	public void BuildDough() {
		pizza.Dough = "thickCroustDough";
	}

	@Override
	public void BuildSauce() {
		pizza.Sauce = "Marinara Sauce";
	}

	@Override
	public void BuildCheese() {
		pizza.Cheese = "Regiano Cheese";
	}

	@Override
	public void BuildVeggies() {
		pizza.Veggies = "Eggplant";
	}

	@Override
	public void BuildPepperoni() {
		pizza.Pepperoni = "SlicedPepperoni";
	}
	
	@Override
	public void BuildClam() {
		pizza.Clam = "Fresh Clams";
	}



}
