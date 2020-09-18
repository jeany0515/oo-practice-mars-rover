package command.pattern;

import java.util.ArrayList;
import java.util.List;

public class CommandReceiver {
    private MarsCar marsCar;

    public CommandReceiver(MarsCar marsCar) {
        this.marsCar = marsCar;
    }

    public MarsLocation receive(String instructions) {
        List<Command> commands = parse(instructions);
        commands.forEach(command -> command.execute(this.marsCar));
        return this.marsCar.getLocation();
    }

    private List<Command> parse(String instructions) {
        List<Command> commands = new ArrayList<>();
        for (int i = 0; i < instructions.length(); i++) {
            char instruction = instructions.charAt(i);
            if(instruction == 'M') {
                commands.add(new MoveCommand());
            }
            if(instruction == 'L') {
                commands.add(new TurnLeftCommand());
            }
            if(instruction == 'R') {
                commands.add(new TurnRightCommand());
            }
        }
        return commands;
    }
}
