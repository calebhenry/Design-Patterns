import java.util.ArrayList;

public abstract class Tree {
    protected ArrayList<String> lines;

    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

    public String toString() {
        return lines;
    }
}