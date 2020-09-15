package marsrover;

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
        if(direction.equals("N")) {
            point.increaseY();
        }
        if(direction.equals("S")) {
            point.decreaseY();
        }
        if(direction.equals("E")) {
            point.increaseX();
        }
        if(direction.equals("W")) {
            point.decreaseX();
        }
    }

    public void changeDirectionLeft() {
        if(direction.equals("N")) {
            direction = "W";
        } else if(direction.equals("W")) {
            direction = "S";
        } else if(direction.equals("S")) {
            direction = "E";
        } else if(direction.equals("E")) {
            direction = "N";
        }
    }

    public void changeDirectionRight() {
        if(direction.equals("N")) {
            direction = "E";
        } else if(direction.equals("E")) {
            direction = "S";
        } else if(direction.equals("S")) {
            direction = "W";
        } else if(direction.equals("W")) {
            direction = "N";
        }
    }
}
