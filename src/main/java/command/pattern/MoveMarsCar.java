package command.pattern;

public class MoveMarsCar implements Command {
    private MarsLocation marsLocation;

    public MoveMarsCar(MarsLocation marsLocation){
        this.marsLocation = marsLocation;
    }

    public void execute() {
        marsLocation.move();
    }
}
