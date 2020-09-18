package command.pattern;

public class MarsCar {
    private final MarsLocation location;

    public MarsCar(MarsLocation location) {
        this.location = location;
    }

    public void move() {
        this.location.changePoint();
    }

    public void turnLeft() {
        this.location.changeDirectionLeft();
    }

    public void turnRight() {
        this.location.changeDirectionRight();
    }

    public MarsLocation getLocation() {
        return location;
    }
}
