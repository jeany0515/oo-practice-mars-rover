package command.pattern;

public class TurnLeftCommand implements Command {
    @Override
    public void execute(MarsCar marsCar) {
        marsCar.turnLeft();
    }
}
