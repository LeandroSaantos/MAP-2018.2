package PizzariaNovaYork;

public class PizzaStoreAF {

	public interface PizzaIngredientFactory {

		public Dough createDough();
		public Sauce createSauce();
		public Cheese createCheese();
		public Veggies[] createVeggies();
		public Pepperoni createPepperoni();
		public Clams createClam();

	}

	// Concrete Factory
	public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {

		public Dough createDough() {
			return new ThinCrustDough();
		}

		public Sauce createSauce() {
			return new MarinaraSauce();
		}

		public Cheese createCheese() {
			return new ReggianoCheese();
		}

		public Veggies[] createVeggies() {
			Veggies veggies[] = { 
					new BlackOlives(),
					new Spinach(),
					new Eggplant() };
			return veggies;
		}

		public Pepperoni createPepperoni() {
			return new SlicedPepperoni();
		}

		public Clams createClam() {
			return new FreshClams();
		}
	}
	// Parts of Pizza
	public interface Dough {
		public String toString();
	}

	public interface Cheese {
		public String toString();
	}

	public interface Sauce {
		public String toString();
	}


	public interface Pepperoni {
		public String toString();
	}

	public class ThickCrustDough implements Dough {

		public String toString() {
			return "ThickCrustDough from Long Island Sound";
		}
	}

	public class PlumTomatoSauce implements Sauce {

		public String toString() {
			return "PlumTomatoSauce";
		}
	}

	public class MarinaraSauce implements Sauce {
		public String toString() {
			return "Marinara Sauce";
		}
	}

	public class ThinCrustDough implements Dough {
		public String toString() {
			return "Thin Crust Dough";
		}
	}

	
	}


