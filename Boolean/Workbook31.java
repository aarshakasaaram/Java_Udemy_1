package Boolean;

    import java.util.Scanner;

    public class Workbook31{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            double change = 3.50;
            double price = 2.50;
            System.out.println("Hi Java, do i have enough change to buy chips:");
            System.out.println("Java: " + (change >= price) + "\n");


            int capacity = 25;
            int persons = 20;
            System.out.println("Hi Java, can the elevator hold everyone?");
            System.out.println("Java: " + (capacity <= persons) + "\n");

            String request = "PS5";
            String purchase = "Toy car";
            System.out.println("Hi Java, will my friend be happy:");
            System.out.println("Java: " + (request.equals(purchase)) + "\n");

            int space = 9;
            int guests = 8;
            System.out.println("Me: Hi Java, can everyone attend my dinner party?");
            System.out.println("Java: " + (space >= guests) + "\n");

            int yourVotes = 24;
            int competitorVotes = 43;
            System.out.println("Me: Hi Java, will I win the election?");
            System.out.println("Java: " + (yourVotes > competitorVotes) + "\n");




        }
    }

