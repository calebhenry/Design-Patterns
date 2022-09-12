/**
 * A type of tree decorator that adds ornaments to the tree
 */
public class Ornaments extends TreeDecorator {

    private Tree tree;

    /**
     * Creates a new tree using the tree decorator super constructor, and integrates
     * the text file for ornaments into the current tree lines array list
     * 
     * @param tree The tree that is going to be modified
     */
    public Ornaments(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        integrateDecor(FileReader.getLines("text/ornaments.txt"));
    }

}
