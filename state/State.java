package state;

/**
 * Contains the methods that all of the TV's states share
 */
public interface State {

    public String pressHomeButton();

    public String pressNetflixButton();

    public String pressHuluButton();

    public String pressMovieButton();

    public String pressTVButton();
}
