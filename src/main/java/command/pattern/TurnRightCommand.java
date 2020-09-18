package command.pattern;

public class TurnRightCommand implements Command {
    @Override
    public void execute(MarsCar marsCar) {
        marsCar.turnRight();
    }
}
