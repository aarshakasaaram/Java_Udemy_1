package Functions;

public class Workbook42 {
    public static void main(String[] args) {
System.out.println("Waiter: I hope you enjoyed your meal!\n" +
        "Thank you!");
        tipTheWaiter(53.50);

    }
    public static void tipTheWaiter(double bill){
        double tip = 0.15*bill;

        System.out.println("your service was wonderful! Please, accept this tip: "+tip);

    }

}
