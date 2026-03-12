package headfirst.designpatterns.strategy.challenge;

public class Discord implements ShareStrategy {
    public void share() {
        System.out.println("I'm sharing the photo on Discord");
    }
}