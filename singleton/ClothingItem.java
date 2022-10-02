import java.util.ArrayList;
/**
 * An item of clothing that has a name, clothing part, color, and a list of seasons it is valid for
 */
public class ClothingItem {
    private String name;
    private ClothingPart part;
    private String color;
    private ArrayList<Season> seasons;

    /**
     * Creates an instance of clothing item and sets its instance variable to the supplied parameters
     * @param name The item of clothing's name
     * @param part The item of clothing's part
     * @param color The item of clothing's color
     */
    public ClothingItem(String name, ClothingPart part, String color) {
        this.name = name;
        this.part = part;
        this.color = color;
        seasons = new ArrayList<Season>();
    }

    /**
     * Checks if the item of clothing has the supplied season
     * @param season The season the clothing item is supposed to contain
     * @return Returns true if the item contains the season
     */
    public boolean hasSeason(Season season) {
        return(seasons.contains(season));
    }

    /**
     * Adds the supplied season to the item of clothing
     * @param season The season that is to be added
     */
    public void addSeason(Season season) {
        if(!hasSeason(season))
            seasons.add(season);
    }

    /**
     * Creates a string representation of the item of clothing
     */
    public String toString() {
        return "A " + color + " " + name;
    }
}
