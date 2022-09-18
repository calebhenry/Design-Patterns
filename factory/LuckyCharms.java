import java.util.ArrayList;

/**
 * A type of cereal named lucky charms
 */
public class LuckyCharms extends Cereal {
    
    /**
     * Creates an instance of lucky charms and sets the name, price, and list of toys to the proper values
     */
    public LuckyCharms() {
        super("Lucky Charms", 1.55);
        toys = new ArrayList<String>();
        toys.add("My Little Pony Stickers");
        toys.add("Elsa ring");
        toys.add("Play doe");
        toys.add("Tiny truck");
    }

     /**
     * Prepares the cereal and creates a string documenting the process
     * @return Returns the string that explains what was done to the cereal
     */
    public String prepare() {
        return(super.prepare()+"\n   -Shape into Xs and Os\n   -Create Marshmallow shapes\n   -Mix grain and marshmallows");
    }
}
