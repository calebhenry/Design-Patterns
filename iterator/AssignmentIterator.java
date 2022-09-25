/**
 * An iterator that allows you to iterate through an array of assignments
 * @author Caleb Henry
 */
public class AssignmentIterator implements java.util.Iterator<Assignment> {
    private Assignment[] assignments;
    private int position = 0;

    /**
    * Creates an instance of Assignment Iterator and sets the instance variable to the supplied parameter
    * @param assignments The list of assignments to be iterated through
    */
    public AssignmentIterator(Assignment[] assignments) {
        this.assignments = assignments;
    }

    /**
     * Checks if there is another assignment in the array
     * @return If there is another assignment
     */
    public boolean hasNext() {
        return (position+1)<assignments.length && assignments[position+1] != null;
    }

    /**
     * Moves to the next assigment in the array
     */
    public Assignment next() {
        return assignments[position++];
    }
}
