package Variables;

public class Workbook23 {

        public static void main(String[] args) {
            int numOfApple = 0;
            int numOfCustomer = 0;
            double profit = 0;
            System.out.println("you picked 500 apples from an apple orchard");
            numOfApple += 500;
            System.out.println("Time for business ! you're selling each apple for 40 cents");
            double priceofapple = 0.40;
            System.out.println("One customer walked in. He bought 4 apples!");
            numOfApple -= 4;
            numOfCustomer++;
            profit += 4*priceofapple;
            System.out.println("Another customer walked in. He bought 20 apples!");
            numOfApple -= 20;
            numOfCustomer++;
            profit += 20*priceofapple;
            System.out.println("Another customer walked in. She bought 200 apples!");
            numOfApple -= 200;
            numOfCustomer++;
            profit += 200 * priceofapple;
            System.out.println("Wow! So far, you made:" +profit);
            System.out.println(numOfCustomer +"customers love your apples.");
            System.out.println("You have "+ numOfApple + " apples left.");



        }

    }


