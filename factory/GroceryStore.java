/**
 * Used to create the boxes of cereal
 */
public class GroceryStore {
    /**
     * Takes the type of the cereal and creates a new cereal of that type
     * @param type The type of cereal that is created
     * @return Returns an instance of cereal with the specified type
     */
    public Cereal createCereal(String type) {
        if(type.equalsIgnoreCase("frosted flakes")) {
            return new FrostedFlakes();
        } else if(type.equalsIgnoreCase("fruit loops")) {
            return new FruitLoops();
        } else if(type.equalsIgnoreCase("lucky charms")) {
            return new LuckyCharms();
        }
        else {
            return new FrostedFlakes();
        }
    }
}
