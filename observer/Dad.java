import java.util.Random;

/**
 * A dad who can be assigned a baby as a subject
 * 
 * @author Caleb Henry
 */
public class Dad implements Observer {

    private Subject baby;
    private Random rand = new Random();

    /**
     * Creates a new dad and assigns him to the designated baby
     * 
     * @param baby The baby that is going to be observed
     */
    public Dad(Subject baby) {
        this.baby = baby;
        baby.registerObserver(this);
    }

    /**
     * When the baby pushes out an update the father prints a random response
     * 
     * @param cry The type of cry the baby sends out
     */
    public void update(Cry cry) {
        int random = rand.nextInt(1, 4);
        if (random == 1) {
            System.out.println("Dad puts a pillow over his head");
        } else if (random == 2) {
            System.out.println("Dad nudges mom");
        } else if (random == 3) {
            System.out.println("Dad screams .... aaaaa");
        }
    }
}
