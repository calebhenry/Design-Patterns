package strategy;

import java.util.ArrayList;

public class CrawlBehavior extends MoveBehavior {
    public void move(ArrayList<String> character)
    {
        move(character, 1);
    }
}
