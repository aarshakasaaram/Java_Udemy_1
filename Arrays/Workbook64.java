package Arrays;
import java.util.Scanner;

public class Workbook64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Java Grocers.");
        System.out.println("What can I help you find");
        String[] asile = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        String response = sc.next();
        for(int i =0;i< asile.length;i++){
            if(asile[i].equals(response)){
                System.out.println("We have that in: " + i);
            }
        }

    }

}
