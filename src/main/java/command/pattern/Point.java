package command.pattern;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point another = (Point) obj;
        return this.x == another.x && this.y == another.y;
    }

    @Override
    public int hashCode() {
        return x + y;
    }

    public void increaseY() {
        y = y + 1;
    }

    public void decreaseY() {
        y = y - 1;
    }

    public void increaseX() {
        x = x + 1;
    }

    public void decreaseX() {
        x = x - 1;
    }
}

