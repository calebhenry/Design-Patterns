import java.util.ArrayList;

/**
 * A type of cereal named frosted flakes
 */
public class FrostedFlakes extends Cereal {
    
    /**
     * Creates an instance of frosted flakes and sets the name, price, and list of toys to the proper values
     */
    public FrostedFlakes() {
        super("Frosted flakes", 2.99);
        toys = new ArrayList<String>();
        toys.add("Spider man Tattoo");
        toys.add("Barbie Tattoo");
        toys.add("Snap Bracelet");
        toys.add("Happy Feet Figurine");
    }

     /**
     * Prepares the cereal and creates a string documenting the process
     * @return Returns the string that explains what was done to the cereal
     */
    public String prepare() {
        return(super.prepare() +"\n   -Shape into flakes\n   -Sprinkle with frosting");
    }
}
