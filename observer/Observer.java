/**
 * Observes a designated subject
 */
public interface Observer {

    /**
     * Indicates what the observer does when it receives an update
     * @param cry The type of cry the baby sends out
     */
    public void update(Cry cry);
}
