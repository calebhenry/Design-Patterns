/**
 * The subject that the observers get information from
 */
public interface Subject {

    /**
     * Adds the observer to the subject's list of valid observers
     * @param observer The observer that is to be added to the list
     */
    public void registerObserver(Observer observer);

    /**
     * Removes the observer from the subject's list of valid observers
     * @param observer The observer that is to be removed from the list
     */
    public void removeObserver(Observer observer);

    /**
     * Sends an update out to the list of observers
     * @param cry The type of cry that is sent out to the observers
     */
    public void notifyObservers(Cry cry);
}
