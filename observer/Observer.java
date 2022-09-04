/**
 * Observes a designated subject
 * 
 * @author Caleb Henry
 */
public interface Observer {

    /**
     * Indicates what the observer does when it receives an update
     * 
     * @param cry The type of cry the baby sends out
     */
    public void update(Cry cry);
}
