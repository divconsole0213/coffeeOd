package coffeeOrder;

public class Mocha extends Topping {

	@Override
	public int cost() {
		toppingCost = 1000;
		return super.cost();
	}

	@Override
	public String toString() {
		newCoffee = "mochaCoffee";
		return super.toString();
	}
	
	

}
