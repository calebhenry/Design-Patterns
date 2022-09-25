/**
 * An assignment with a title, description, and topic
 * @author Caleb Henry
 */
public class Assignment {
    private String title;
    private String description;
    private Topic topic;

    /**
     * Creates an instance of assignment and sets the instance variables to the supplied parameters
     * @param title The title of the course
     * @param description The description of the course
     * @param topic The topic of the course
     */
    public Assignment(String title, String description, Topic topic) {
        this.title = title;
        this.description = description;
        this.topic = topic;
    }

    /**
     * Checks if an assignment has the supplied topic
     * @param topic The topic the assignment is being checked for
     * @return If the assignment has the topic
     */
    public boolean hasTopic(Topic topic) {
        return topic.equals(this.topic);
    }

    /**
     * Prints the assignment
     */
    public String toString() {
        return this.title + ": " + this.description;
    }
}
