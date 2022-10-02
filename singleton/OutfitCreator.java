import java.util.Random;
import java.util.ArrayList;

/**
 * A class that creates outfits, with only one instance of the class avalaible at all times
 */
public class OutfitCreator {
    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms;
    private ArrayList<ClothingItem> wholes;
    private Random rand;
    private static OutfitCreator outfitCreator;

    /**
     * Creates an instance of outfit creator that can only be accessed within the class and populates its array lists
     */
    private OutfitCreator() {
        FileReader reader = new FileReader();
        tops = reader.getClothing("./tops.txt", ClothingPart.TOP);
        bottoms = reader.getClothing("./bottoms.txt", ClothingPart.BOTTOM);
        wholes = reader.getClothing("./wholes.txt", ClothingPart.WHOLE);
    }

    /**
     * Creates and returns an instance of outfit creator
     * @return Returns the instance of outfit creator
     */
    public static OutfitCreator getInstance() { 
        if(outfitCreator == null) {
            outfitCreator = new OutfitCreator();
        }
        return outfitCreator;
    }

    /**
     * Creates a string representation of a random outfit apporpriate for the supplied season
     * @param season The season the outfit must be apporpriate for
     * @return A string that represents the apporpriate outfit, randomly composed of either a top and bottom or a one piece outfit
     */
    public String getOutfit(Season season) {
        rand = new Random();
        String outfit = "";
        if(rand.nextBoolean()) {
            String topFinal = "";
            String bottomFinal = "";
            Boolean found = false;
            while(!found) {
                ClothingItem top = tops.get(rand.nextInt(tops.size()));
                found = top.hasSeason(season);
                topFinal = top.toString();
            }
            found = false;
            while(!found) {
                ClothingItem bottom = bottoms.get(rand.nextInt(bottoms.size()));
                found = bottom.hasSeason(season);
                bottomFinal = bottom.toString();
            }
            outfit = topFinal + "and " + bottomFinal;
        }
        else {
            Boolean found = false;
            while(!found) {
                ClothingItem whole = wholes.get(rand.nextInt(wholes.size()));
                found = whole.hasSeason(season);
                outfit = whole.toString();
            }
        }
        return outfit;
    }

}
