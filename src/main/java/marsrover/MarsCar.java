package marsrover;

public class MarsCar {
    private final MarsLocation location;

    public MarsCar(MarsLocation location) {
        this.location = location;
    }

    public MarsLocation getLocation() {
        return location;
    }

    public MarsLocation execute(String instruction) {
        if(instruction.equals("M")) {
            location.changePoint();
        }
        return location;
    }
}
