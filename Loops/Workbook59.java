package Loops;
import java.util.Scanner;

public class Workbook59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Javagram! Sign in below");
        String Username = sc.next();
        String Password = sc.next();
        while (true) {
            if (Username.equals("aarsha")&& Password.equals("123")) {
                System.out.println("Login sucessfull");
                break;

            }
            System.out.println("Wrong login");
            Username = sc.next();
            Password = sc.next();
            }


        }
    }
