package strategy;

import java.util.ArrayList;

public class WalkBehavior extends MoveBehavior{
    public void move(ArrayList<String> character)
    {
        move(character, 2);
    }
}
