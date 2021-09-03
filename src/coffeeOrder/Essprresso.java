package coffeeOrder;

public final class Essprresso extends Coffee {

	@Override
	public int cost() {
		int addcost = 500;
		return super.cost() + addcost;
	}

	@Override
	public String toString() {
		
		return "에스프레소의 가격은\s" + cost()+"입니다.";
	}

	
}
