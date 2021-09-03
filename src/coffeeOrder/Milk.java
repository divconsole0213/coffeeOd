package coffeeOrder;

public class Milk extends Topping {
 
	
	@Override
	public int cost() {
		toppingCost = 1000;
		return super.cost();
	}

	@Override
	public String toString() {
       newCoffee = "caffeLatte";
		return super.toString();
	}

	
}
