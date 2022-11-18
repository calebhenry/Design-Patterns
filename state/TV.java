package state;

/**
 * A tv that has several different available states
 */
public class TV {
    private State homeState;
    private State huluState;
    private State netflixState;
    private State state;

    /**
     * Constructs an instance of TV and sets up its states
     */
    public TV() {
        homeState = new HomeState(this);
        huluState = new HuluState(this);
        netflixState = new NetflixState(this);
        state = homeState;
    }

    /**
     * Calls the press home button method on the current state
     * 
     * @return The string that method returns
     */
    public String pressHomeButton() {
        return state.pressHomeButton();
    }

    /**
     * Calls the press Netflix button method on the current state
     * 
     * @return The string that method returns
     */
    public String pressNetflixButton() {
        return state.pressNetflixButton();
    }

    /**
     * Calls the press Hulu button method on the current state
     * 
     * @return The string that method returns
     */
    public String pressHuluButton() {
        return state.pressHuluButton();
    }

    /**
     * Calls the press movie button method on the current state
     * 
     * @return The string that method returns
     */
    public String pressMovieButton() {
        return state.pressMovieButton();
    }

    /**
     * Calls the press TV button method on the current state
     * 
     * @return The string that method returns
     */
    public String pressTVButton() {
        return state.pressTVButton();
    }

    /**
     * Sets the state of the TV to the supplied state
     * 
     * @param state The new state of the TV
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Gets the current instance of home state for the TV
     * 
     * @return The instance of state
     */
    public State getHomeState() {
        return homeState;
    }

    /**
     * Gets the current instance of Netflix state for the TV
     * 
     * @return The instance of state
     */
    public State getNetflixState() {
        return netflixState;
    }

    /**
     * Gets the current instance of Hulu state for the TV
     * 
     * @return The instance of state
     */
    public State getHuluState() {
        return huluState;
    }
}
