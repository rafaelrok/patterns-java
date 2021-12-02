package patternStrategy;

public class Bot {

    private Behavior behavior;

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void move() {
        behavior.move();
    }
}
