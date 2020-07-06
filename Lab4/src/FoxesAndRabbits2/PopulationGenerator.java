package FoxesAndRabbits2;

import java.util.List;
import java.util.Random;

public class PopulationGenerator
{
	private static final double FOX_CREATION_PROBABILITY = 0.03;
	private static final double RABBIT_CREATION_PROBABILITY = 0.05;
	private static final double TIGER_CREATION_PROBABILITY=0.01;
	private Field field;
	private List<Animal> animals;
	public PopulationGenerator(Field f,List<Animal> a)
	{
		field=f;
		animals=a;
	}
	public void populate()
    {
        Random rand = Randomizer.getRandom();
        field.clear();
        for(int row = 0; row < field.getDepth(); row++) {
            for(int col = 0; col < field.getWidth(); col++) {
            	if(rand.nextDouble() <= TIGER_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Tiger tiger = new Tiger(true, field, location);
                    animals.add(tiger);
                }
            	else if(rand.nextDouble() <= FOX_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Fox fox = new Fox(true, field, location);
                    animals.add(fox);
                }

            	else if(rand.nextDouble() <= RABBIT_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Rabbit rabbit = new Rabbit(true, field, location);
                    animals.add(rabbit);
                }
                                // else leave the location empty.
                
            }
        }

    }
}