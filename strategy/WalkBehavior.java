package strategy;

import java.util.ArrayList;

public class WalkBehavior extends MoveBehavior {

    private static final int WALK_SPEED = 2;

    public void move(ArrayList<String> character) {
        move(character, WALK_SPEED);
    }
}
