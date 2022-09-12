import java.util.ArrayList;

/**
 * A tree that stores its contents as a string array list
 * 
 * @author Caleb Henry
 */
public abstract class Tree {
    protected ArrayList<String> lines;

    /**
     * Creates a tree and sets its contents to the supplied array list
     * 
     * @param lines The string array list that will make up the tree
     */
    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * Prints out the contents of the tree
     */
    public String toString() {
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
        return "";
    }
}