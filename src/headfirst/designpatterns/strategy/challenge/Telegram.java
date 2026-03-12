package headfirst.designpatterns.strategy.challenge;

public class Telegram implements ShareStrategy {
    public void share() {
        System.out.println("I'm sharing the photo on Telegram");
    }
}