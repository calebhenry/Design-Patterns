/**
 * A mom who can be assigned a baby as a subject
 * 
 * @author Caleb Henry
 */
public class Mom implements Observer {

    private Subject baby;

    /**
     * Creates a new mom and assigns her to the designated baby
     * 
     * @param baby The baby that is going to be observed
     */
    public Mom(Subject baby) {
        this.baby = baby;
        baby.registerObserver(this);
    }

    /**
     * When the baby pushes out an update the mom uses the tyoe of cry to pick the
     * appropriate response and calls it in the baby's methods
     * 
     * @param cry The type of cry the baby sends out
     */
    public void update(Cry cry) {
        if (cry.equals(Cry.ANGRY)) {
            System.out.println("Mom hugs " + ((Baby) baby).getName());
            ((Baby) baby).receiveLove();
        } else if (cry.equals(Cry.HUNGRY)) {
            System.out.println("Mom feeds " + ((Baby) baby).getName());
            ((Baby) baby).eat();
        } else if (cry.equals(Cry.WET)) {
            System.out.println("Mom changes " + ((Baby) baby).getName());
            ((Baby) baby).getChanged();
        }
    }
}
