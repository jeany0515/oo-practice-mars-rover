package marsrover;

import java.util.List;

public class MarsCar {
    private final MarsLocation location;

    public MarsCar(MarsLocation location) {
        this.location = location;
    }

    public MarsLocation getLocation() {
        return location;
    }

    public MarsLocation execute(List<String> instructions) {
        instructions.forEach(instruction -> {
            if(instruction.equals("M")) {
                location.move();
            }
            if(instruction.equals("L")) {
                location.turnLeft();
            }
            if(instruction.equals("R")) {
                location.turnRight();
            }
        });
        return location;
    }
}
