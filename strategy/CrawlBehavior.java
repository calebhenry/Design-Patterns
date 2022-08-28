package strategy;

import java.util.ArrayList;

public class CrawlBehavior extends MoveBehavior {

    private static final int CRAWL_SPEED = 1;

    public void move(ArrayList<String> character) {
        move(character, CRAWL_SPEED);
    }
}
