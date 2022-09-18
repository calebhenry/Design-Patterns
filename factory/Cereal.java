import java.util.ArrayList;
import java.util.Random;

/**
 * A box of cereal with a name, price, and list of potential toys that can be in the box
 */
public abstract class Cereal {
    protected String name;
    protected double price;
    protected ArrayList<String> toys;

    /**
     * Creates an instance of cereal and sets the instance variables to the supplied parameters
     * @param name The type of cereal
     * @param price The price of the cereal
     */
    public Cereal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Prepares the cereal and creates a string documenting the process
     * @return Returns the string that explains what was done to the cereal
     */
    public String prepare() {
        return("Preparing the " + this.name + "\n   -Gather the Grain");
    }

    /**
     * Boxes the cereal and creates a string documenting the process
     * @return Returns the string that explains what was done to the cereal
     */
    public String boxCereal() {
        Random toySelector = new Random();
        return("\nBoxing the " + this.name + "\n   -Drawing fun picture of " + this.name + " on the box\n   -Pouring the " + this.name + " into the box\n   -Adding the suprise " + toys.get(toySelector.nextInt(4)));
    }

    /**
     * Puts the price on the box of cereal and creates a string documenting the process
     * @return Returns the string that explains what was done to the cereal
     */
    public String priceCereal() {
        return("\nPutting the price tag of $" + this.price + " on the " + this.name + " box");
    }

}
