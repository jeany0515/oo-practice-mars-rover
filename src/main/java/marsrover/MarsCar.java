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
                location.changePoint();
            }
            if(instruction.equals("L")) {
                location.changeDirectionLeft();
            }
            if(instruction.equals("R")) {
                location.changeDirectionRight();
            }
        });
        return location;
    }
}
