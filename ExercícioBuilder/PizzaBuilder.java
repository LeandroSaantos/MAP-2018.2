package PizzaNyBuilder;

public abstract class PizzaBuilder {
		protected PizzaNy pizza = new PizzaNy();
		public abstract void BuildDough();
		public abstract void BuildSauce();
		public abstract void BuildCheese();
		public abstract void BuildVeggies();
		public abstract void BuildPepperoni();
		public abstract void BuildClam();
		public PizzaNy get pizza () {
			return pizza;
		}
}
