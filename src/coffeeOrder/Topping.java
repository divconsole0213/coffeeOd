package coffeeOrder;

public abstract class Topping extends Coffee{
int toppingCost; 

	
 
 

	@Override
	public int cost() {
		 
		return super.cost() + toppingCost;
	}





	@Override
	public String toString() {
		
		return super.toString();
	}

	
}

	

