package command.pattern;

public class MarsLocation {
    private final Point point;
    private String direction;

    public MarsLocation(Point point, String direction) {
        this.point = point;
        this.direction = direction;
    }
    public MarsLocation() {
        this.point = new Point(0, 0);
        this.direction = "N";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MarsLocation)) {
            return false;
        }
        MarsLocation another = (MarsLocation) obj;
        return this.point.equals(another.point) && this.direction.equals(another.direction);
    }

    @Override
    public int hashCode() {
        return point.hashCode() + direction.hashCode();
    }

    public void changePoint() {
        switch (direction) {
            case "N":
                point.increaseY();
                break;
            case "S":
                point.decreaseY();
                break;
            case "E":
                point.increaseX();
                break;
            case "W":
                point.decreaseX();
                break;
        }
    }

    public void changeDirectionLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "W":
                direction = "S";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
        }
    }

    public void changeDirectionRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
        }
    }
}
