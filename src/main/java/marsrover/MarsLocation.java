package marsrover;

public class MarsLocation {
    private final Point point;
    private final String direction;

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
        return point.hashCode() + point.hashCode();
    }

}
