package command.pattern;

public class MoveCommand implements Command {
    @Override
    public void execute(MarsCar marsCar) {
        marsCar.move();
    }
}
