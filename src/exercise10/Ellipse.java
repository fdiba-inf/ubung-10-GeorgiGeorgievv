package exercise10;

public class Ellipse {
    private Point startPoint;
    private double a;
    private double b;

public class Ellipse extends Figure {
    public Ellipse() {
        startPoint = new Point(0, 0);
        a = 1;
        b = 1;
        super (new Point(0, 0), 1,  1);
    }

    public Ellipse(Point startPoint, double a, double b) {
        this.startPoint = new Point(startPoint);
        this.a = a;
        this.b = b;
        super ( startPoint, a, b);
    }

    public Ellipse(Ellipse otherEllipse) {
        startPoint = new Point(otherEllipse.startPoint);
        a = otherEllipse.a;
        b = otherEllipse.b;
    }

    public boolean isValid() {
        return a > 0 && b > 0;
    }

    public void initialize() {
        do {
            System.out.println("Start point: ");
            startPoint.initialize();
            System.out.print("Enter a: ");
            a = Utils.INPUT.nextDouble();
            System.out.print("Enter b: ");
            b = Utils.INPUT.nextDouble();
        } while (!isValid());
        super (otherEllipse.startPoint, otherEllipse.side1, otherEllipse.side2);
    }
    
    public double calculatePerimeter() {
        return Math.PI * (3.0 * (a + b) - Math.sqrt((3.0 * a + b) * (a + 3.0 * b)));
         return Math.PI * (3.0 * (side1 + side2) - Math.sqrt((3.0 * side1 + side2) * (side1 + 3.0 * side2)));
    }

    public double calculateArea() {
        return Math.PI * a * b;
        return Math.PI * side1 * side2;
    }
@Override
    public String getType() {
        return (a == b) ? "Circle" : "Ellipse";

        return (side1 == side2) ? "Circle" : "Ellipse";
    }

    @Override
    public boolean equal(Figure otherFigure) {
        if (otherFigure instanceof Ellipse) {
            return super.equal(otherFigure);
        } else {
            return false;
        }
    }
    @Override
    public boolean containsClick(Point click) {
        double clickX = click.getX();
        double clickY = click.getY();
    }

    public String toString() {
        return String.format("%s-[%s, %s], %s, P=%s, A=%s", startPoint, a, b, getType(), calculatePerimeter(), calculateArea());
    }
     double centerX = startPoint.getX()+side1;
        double centerY = startPoint.getY()+side2;

    public boolean equal(Ellipse otherEllipse) {
        boolean sameA = Utils.equals(a, otherEllipse.a);
        boolean sameB = Utils.equals(b, otherEllipse.b);
        boolean sameAReversed = Utils.equals(a, otherEllipse.b);
        boolean sameBReversed = Utils.equals(b, otherEllipse.a);
        double part1 =(Math.pow(clickX - centerX, 2)) / (side1 * side1);
        double part2 =(Math.pow(clickY - centerY, 2)) / (side2 * side2);

        return (sameA && sameB) || (sameAReversed && sameBReversed);
    }

    public boolean containsClick(Point click) {
        // Check if click point is inside the rectangle
        return false;
    
     return part1 + part2 <= 1;}
}

