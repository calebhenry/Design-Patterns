package state;

/**
 * The state of the TV when it is on the Hulu screen
 */
public class HuluState implements State {
    private TV tv;
    private String[] movies;
    private String[] tvShows;

    /**
     * Creates a Hulu state for a given TV
     * 
     * @param tv The tv that is being given the state
     */
    public HuluState(TV tv) {
        this.tv = tv;
        movies = new String[] { "Cars", "Cinderella", "Wall-E", "ET" };
        tvShows = new String[] { "Sesame Street", "Care Bears", "Loney Tunes" };
    }

    /**
     * Sets the state of the TV to the Home state
     * 
     * @return The string representation of this
     */
    @Override
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading the Home Screen...";
    }

    /**
     * Sets the state of the TV to the Home state
     * 
     * @return The string representation of this
     */
    @Override
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...";
    }

    /**
     * Informs the user that the TV is already in the Hulu state
     * 
     * @return The string representation of this
     */
    @Override
    public String pressHuluButton() {
        return "TV is already on the Hulu screen.";
    }

    /**
     * Gets the list of movies for the Netflix state
     * 
     * @return A string representation of the movies
     */
    @Override
    public String pressMovieButton() {
        String ret = "Hulu Movies:";
        for (int i = 0; i < movies.length; i++) {
            ret += "\n - " + movies[i];
        }
        return ret;
    }

    /**
     * Gets the list of TV shows for the Netflix state
     * 
     * @return A string representation of the TV shows
     */
    @Override
    public String pressTVButton() {
        String ret = "Hulu TV Shows:";
        for (int i = 0; i < tvShows.length; i++) {
            ret += "\n - " + tvShows[i];
        }
        return ret;
    }
}
