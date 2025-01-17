package inheritance;


public class Main1{
    public static void main(String[] args){

        Cylinder cylinder = new Cylinder(1.0, 2.0);
        Sphere sphere = new Sphere(1.0,6.0);
         printMeasures(sphere);
         printMeasures(cylinder);


    }
    public static void printMeasures(Radius radius) {
        System.out.println("\n" + Radius.getClass().getSimpleName());
        System.out.println("Area: " + Radius.getArea());
        System.out.println("Volume: " + Radius.getvolume());
}}