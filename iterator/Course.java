/**
 * A course with an array of assignments and a name
 * @author Caleb Henry
 */
public class Course {
    private Assignment[] assignments;
    private int count;
    private String name;
    private String title;

    /**
     * Creates an instance of course and sets the instance variables to the supplied parameters
     * @param name The name of the class
     * @param title The title of the class
     */
    public Course(String name, String title) {
        this.name = name;
        this.title = title;
        this.count = 0;
        this.assignments = new Assignment[count];
    }

    /**
     * Adds a new assinment to the course's array of assingments
     * @param title The title of the new assignment
     * @param description The description of the new assignment
     * @param topic The topic of the new assignment
     */
    public void addAssignment(String title, String description, Topic topic) {
        Assignment assignment = new Assignment(title, description, topic);
        assignments = growArray(assignments);
        assignments[count] = assignment;
        count++;
    }

/**
 * Creates an instance of an assignment iterator
 * @return The instance of the assignent iterator class
 */
    public AssignmentIterator createIterator() {
        return new AssignmentIterator(assignments);
    }

    /**
     * Prints the course
     */
    public String toString() {
        return name + ": " + title;
    }

    /**
     * Grows the array of assignments by one
     * @param first The original array
     * @return The new array
     */
    private Assignment[] growArray(Assignment[] first) {
        Assignment[] expandedArray = new Assignment[count+1];
        for(int i=0; i<count;i++) {
            expandedArray[i] = first[i];
        }
        return expandedArray;
    }
}
