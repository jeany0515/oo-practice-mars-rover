package command.pattern;

public class TurnRightMarsCar implements Command {
    private MarsLocation marsLocation;

    public TurnRightMarsCar(MarsLocation marsLocation){
        this.marsLocation = marsLocation;
    }

    public void execute() {
        marsLocation.turnRight();
    }
}
