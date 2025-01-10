package Functions;

public class Workbook43 {
    public static void main(String[] args) {
        double noon = 77;
        double evening = 61;
        double midnight = 55;
        System.out.println("c: " +noon);
        System.out.println("F: " + fahrenheitToCelsius(noon) + "\n");
        System.out.println("c: " +evening);
        System.out.println("F: " + fahrenheitToCelsius(evening));
        System.out.println("c: " +midnight);
        System.out.println("F: " + fahrenheitToCelsius(midnight));


    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return  (fahrenheit - 32) * 5/9;
    }
}
