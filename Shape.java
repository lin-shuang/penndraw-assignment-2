import src.PennDraw;

public class Shape {
    private double x;
    private double y;
    private double radius;
    private double sideLength;

    public void draw() {
        if (radius > 0) {
            PennDraw.circle(x, y, radius);
        } else if (sideLength > 0) {
            PennDraw.square(x, y, sideLength);
        }
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public void setSideLength(double s) {
        this.sideLength = s;
    }
}