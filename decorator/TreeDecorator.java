import java.util.ArrayList;

/**
 * A type of tree that is capable of adding new things to the tree
 * 
 * @author Caleb Henry
 */
public abstract class TreeDecorator extends Tree {

    /**
     * Creates a new tree using the super constructor for tree, and sets its lines
     * array list
     * 
     * @param lines The array list that makes up the tree
     */
    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
    }

    /**
     * Combines two array lists by replacing spaces in the trees existing array list
     * with text from a new array list
     * 
     * @param decor The array list that is to be added to the existing array list
     */
    protected void integrateDecor(ArrayList<String> decor) {
        ArrayList<String> temp = new ArrayList<String>();
        String tempLine = "";
        for (int i = 0; i < decor.size(); i++) {
            for (int j = 0; j < decor.get(i).length(); j++) {
                if (decor.get(i).substring(j, j + 1).equalsIgnoreCase(" ")) {
                    tempLine += this.lines.get(i).substring(j, j + 1);
                } else {
                    tempLine += decor.get(i).substring(j, j + 1);
                }
            }
            temp.add(tempLine);
            tempLine = "";
        }
        if (temp.size() == this.lines.size()) {
            this.lines = temp;
        } else {
            for (int i = temp.size(); i < this.lines.size(); i++) {
                temp.add(this.lines.get(i));
            }
            this.lines = temp;
        }

    }
}
