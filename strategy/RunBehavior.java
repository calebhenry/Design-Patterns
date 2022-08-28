package strategy;

import java.util.ArrayList;

public class RunBehavior extends MoveBehavior {

    private static final int RUN_SPEED = 3;

    public void move(ArrayList<String> character) {
        move(character, RUN_SPEED);
    }
}
