package strategy;

import java.util.ArrayList;

public abstract class Robot {
    protected String name;
    protected ArrayList<String> character = new ArrayList<String>();
    protected MoveBehavior moveBehavior;

    public Robot(String name)
    {
        this.name = name;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void move()
    {
        moveBehavior.move(character);
    }

    public abstract String toString();

    public String getName()
    {
        return this.name;
    }


}
