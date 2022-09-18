import java.util.ArrayList;

/**
 * A type of cereal named fruit loops
 */
public class FruitLoops extends Cereal {

    /**
     * Creates an instance of fruit loops and sets the name, price, and list of toys to the proper values
     */
    public FruitLoops() {
        super("Fruit Loops", 1.89);
        toys = new ArrayList<String>();
        toys.add("Paw Patrol Stickers");
        toys.add("Bat Man ring");
        toys.add("Silly Putty");
        toys.add("Tiny Car");
    }

     /**
     * Prepares the cereal and creates a string documenting the process
     * @return Returns the string that explains what was done to the cereal
     */
    public String prepare() {
        return(super.prepare()+"\n   -Shape into circles\n   -Randomly color circles\n   -Let circles dry");
    }
}
