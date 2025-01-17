package inheritance;
public class Sphere extends Radius{
   private double height;

    public Sphere(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(super.getRadius(), 2);
    }

    @Override
    public double getvolume() {
        return (4/3) * Math.PI * Math.pow(super.getRadius(), 3);
    }
}


