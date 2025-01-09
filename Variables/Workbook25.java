package Variables;
import java.util.Scanner;

public class Workbook25 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What is your first name?");
            String firstname = sc.nextLine();
            System.out.println("What is your lastname?");
            String lastname = sc.nextLine();
            System.out.println("How old are you?");
            int age = sc.nextInt();
            System.out.println("Make a username");
            sc.nextLine();
            String username = sc.nextLine();
            System.out.println("What city do you live in?");
            String city = sc.nextLine();
            System.out.println("What country is that?");
            String country = sc.nextLine();
            System.out.println("Thank You for joing JavaGram!");
            System.out.println("\nHere is teh information you entered:");
            System.out.println("\tFirst Name:firstname");
            System.out.println("\tLast Name:lastname");
            System.out.println("\tAge: age");
            System.out.println("\tusername:uasername");
            System.out.println("\tCity: city");
            System.out.println("\tCountry:country");

        }

    }


