/**
 * A type of tree that reads its contents froma file
 * 
 * @author Caleb Henry
 */
public class ChristmasTree extends Tree {

    /**
     * Creates a new tree and sets its stored text as the text from a specific file
     */
    public ChristmasTree() {
        super(FileReader.getLines("text/tree.txt"));
    }
}
