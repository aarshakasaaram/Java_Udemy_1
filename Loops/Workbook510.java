package Loops;
import java.util.Scanner;

public class Workbook510 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = getRandom();
        int b = getRandom();
        System.out.println("Dice 1: " + a);
        System.out.println("Dice 2: " + b);

        while(a  != b){
            a = getRandom();
            b = getRandom();
            System.out.println("Dice 1: " + a);
            System.out.println("Dice 2: " + b);
        }
        System.out.println("You rolled doubles");

    }
    public static int getRandom(){
        return (int)(Math.random() * 7);
    }

}
