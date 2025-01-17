package inheritance;
public abstract class Radius{

        private double radius;

    public Radius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public static void fold(){
        System.out.println(" carry my objects");
    }
    public  abstract double getArea();
    public abstract double  getvolume();

}