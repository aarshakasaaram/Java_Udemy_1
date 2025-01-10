package Loops;
import java.util.Scanner;

public class Workbook58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I chose a number between 1 and 5. Try to guess it: ");
        int num = sc.nextInt();
        int secret = (int)(Math.random()*6);
        while(num <= 5 && num >= 1){
            if(num == secret){
                System.out.println("You got it");
                break;
            }
            System.out.println("Guess again: ");
            num = sc.nextInt();

        }
    }
}
