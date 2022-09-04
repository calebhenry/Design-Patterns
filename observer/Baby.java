import java.util.ArrayList;
import java.util.Random;

/**
 * A baby that is a subject meant to be observed by a list of observers
 * 
 * @author Caleb Henry
 */
public class Baby implements Subject {
    private String name;
    private ArrayList<Observer> observers;
    private Random rand = new Random();
S
    /**
     * Creates a baby, sets its name, and adds a list of observers
     * 
     * @param name The name of the baby
     */
    public Baby(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * Fetches the name of the baby
     * 
     * @return Returns a String that represents the name of the baby
     */
    public String getName() {
        return this.name;
    }

    /**
     * Randomly selects the baby's response to being given love
     */
    public void receiveLove() {
        int random = rand.nextInt(1, 3);
        if (random == 1) {
            System.out.println(this.name + " feels appreciated and loved.");
        } else if (random == 2) {
            System.out.println(this.name + " pushes everyone away and continues to cry.");
        }
    }

    /**
     * Randomly selects the baby's response to beign fed
     */
    public void eat() {
        int random = rand.nextInt(1, 3);
        if (random == 1) {
            System.out.println(this.name + " has a happy full tummy.");
        } else if (random == 2) {
            System.out.println(this.name + " throws all his food on the floor.");
        }
    }

    /**
     * Shows the baby's response to having its diaper changed
     */
    public void getChanged() {
        System.out.println(this.name + " is having a diaper change");
    }

    /**
     * Adds the observer to the baby's array list of observers
     * 
     * @param observer The observer that is added to the list
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes the observer from the baby's array list of observers
     * 
     * @param observer The observer that is removed from the list
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Iterates through the list of observers and updates them with the baby's
     * current cry
     * 
     * @param cry The cry that the observers are given
     */
    public void notifyObservers(Cry cry) {
        for (Observer observer : observers) {
            observer.update(cry);
        }
    }

    /**
     * Prints that the baby is angry and updates the baby's observers
     */
    public void angryCry() {
        System.out.println("Waaaaaaaaaa! " + this.name + " is feeling abandoned and angry.");
        notifyObservers(Cry.ANGRY);
    }

    /**
     * Prints that the baby is hungry and updates the baby's observers
     */
    public void hungryCry() {
        System.out.println("Neh Neh Neh! " + this.name + " is starving!!!");
        notifyObservers(Cry.HUNGRY);
    }

    /**
     * Prints that the baby is wet and updates the baby's observers
     */
    public void wetCry() {
        System.out.println("Aaaaaaa! " + this.name + " is WET!");
        notifyObservers(Cry.WET);
    }
}
