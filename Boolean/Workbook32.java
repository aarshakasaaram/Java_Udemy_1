package Boolean;

public class Workbook32 {
    public static void main(String[] args) {
        double wallet = 100;
        double toycar = 5.99;
        System.out.println("Can I get this car?");
        if(wallet >= toycar){
            System.out.println("Sure!\n");
            wallet -= toycar;
        }
        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");
        if(wallet >= nike){
            System.out.println("Sure!");

        }
        else{
            System.out.println("Sorry, I only have " + wallet +" left");
        }
    }

}
