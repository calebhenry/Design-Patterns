package strategy;

import java.util.ArrayList;

public class RunBehavior extends MoveBehavior {
    
    public void move(ArrayList<String> character)
    {
        move(character, 3);
    }
}
