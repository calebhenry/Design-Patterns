package state;

/**
 * The state of the TV when it is on the Netflix screen
 */
public class NetflixState implements State {
    private TV tv;
    private String[] movies;
    private String[] tvShows;

    /**
     * Creates a Netflix state for a given TV
     * 
     * @param tv The tv that is being given the state
     */
    public NetflixState(TV tv) {
        this.tv = tv;
        movies = new String[] { "The Land Before Time", "Frozen", "The Little Mermaid", "Ice age" };
        tvShows = new String[] { "Peppa Pig", "My Little Pony", "Garfield", "Teenage Mutant Ninja Turtles" };
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
     * Informs the user that the TV is already in the Netflix state
     * 
     * @return The string representation of this
     */
    @Override
    public String pressNetflixButton() {
        return "TV is already on the Netflix screen.";
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
     * Gets the list of movies for the Netflix state
     * 
     * @return A string representation of the movies
     */
    @Override
    public String pressMovieButton() {
        String ret = "Netflix Movies:";
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
        String ret = "Netflix TV Shows:";
        for (int i = 0; i < tvShows.length; i++) {
            ret += "\n - " + tvShows[i];
        }
        return ret;
    }
}
