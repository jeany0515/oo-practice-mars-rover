package command.pattern;

import java.util.ArrayList;
import java.util.List;

public class MarsCar {
    private final MarsLocation location;
    private List<Command> commands = new ArrayList<Command>();

    public MarsCar(MarsLocation location) {
        this.location = location;
    }

    private void ParseInstructions(String instructions) {
        for (int i = 0; i < instructions.length(); i++) {
            char instruction = instructions.charAt(i);
            if(instruction == 'M') {
                commands.add(new MoveMarsCar(location));
            }
            if(instruction == 'L') {
                commands.add(new TurnLeftMarsCar(location));
            }
            if(instruction == 'R') {
                commands.add(new TurnRightMarsCar(location));
            }
        }
    }

    public MarsLocation execute(String instructions) {
        ParseInstructions(instructions);
        commands.forEach(Command::execute);
        return location;
    }
}
