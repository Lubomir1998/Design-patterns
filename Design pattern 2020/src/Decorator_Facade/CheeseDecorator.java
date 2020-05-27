package Decorator_Facade;

public class CheeseDecorator extends BurgerDecorator {

	public CheeseDecorator(Burger decoratedBurger) {
		super(decoratedBurger);
		
	}
	
	
	public String getDescription(){
		return decoratedBurger.getDescription() + " with cheese";
	}
	
	public double getCost(){
		return decoratedBurger.getCost() + 2.00;
	}
	

}
