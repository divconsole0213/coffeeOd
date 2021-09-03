package coffeeOrder;


public class Test {

	public static void main(String[] args) {
  Coffee ame = new Coffee() {
};
  ame.setBean("java");
  ame.setIce("hot");
  ame.setShot(2);
  System.out.println(ame);
   Coffee coffee = new Milk();
   coffee.setBean("java");
   coffee.setIce("ice");
   coffee.setShot(1);
   System.out.println(coffee);
 
 
	}
}