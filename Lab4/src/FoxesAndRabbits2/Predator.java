package FoxesAndRabbits2;

public abstract class Predator extends Animal {

	public Predator(Field field, Location location) {
		super(field, location);
		// TODO Auto-generated constructor stub
	}
	
	protected abstract Location hunt();

}
