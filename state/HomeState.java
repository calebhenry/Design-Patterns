package state;

/**
 * The state of the TV when it is on the Home screen
 */
public class HomeState implements State {
    private TV tv;

    /**
     * Creates a Home state for a given TV
     * 
     * @param tv The tv that is being given the state
     */
    public HomeState(TV tv) {
        this.tv = tv;
    }

    /**
     * Informs the user that the TV is already in the Home state
     * 
     * @return The string representation of this
     */
    @Override
    public String pressHomeButton() {
        return "TV is already on the home screen.";
    }

    /**
     * Sets the state of the TV to the Netflix screen
     * 
     * @return The string representation of this
     */
    @Override
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...";
    }

    /**
     * Sets the state of the TV to the Hulu screen
     * 
     * @return The string representation of this
     */
    @Override
    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...";
    }

    /**
     * Informs the user that the movies are not available in the home state
     * 
     * @return The string representation of this
     */
    @Override
    public String pressMovieButton() {
        return "Home: You must pick an app to show movies.";
    }

    /**
     * Informs the user that the TV shows are not available in the home state
     * 
     * @return The string representation of this
     */
    @Override
    public String pressTVButton() {
        return "Home: You must pick an app to show tv shows.";
    }
}
