package command.pattern;

public class TurnLeftMarsCar implements Command {
    private MarsLocation marsLocation;

    public TurnLeftMarsCar(MarsLocation marsLocation){
        this.marsLocation = marsLocation;
    }

    public void execute() {
        marsLocation.turnLeft();
    }
}
