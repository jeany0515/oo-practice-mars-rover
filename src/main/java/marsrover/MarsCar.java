package marsrover;

public class MarsCar {
    private final MarsLocation location;

    public MarsCar(MarsLocation location) {
        this.location = location;
    }

    public MarsLocation getLocation() {
        return location;
    }

    public MarsLocation execute(String instructions) {
        for (int i = 0; i < instructions.length(); i++) {
            char instruction = instructions.charAt(i);
            if(instruction == 'M') {
                location.move();
            }
            if(instruction == 'L') {
                location.turnLeft();
            }
            if(instruction == 'R') {
                location.turnRight();
            }
        }
        return location;
    }
}
