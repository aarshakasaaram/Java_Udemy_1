package Variables;

public class workbook21 {

    public static void main(String[] args) {
        int points =0;
        System.out.println("Harry was caught wandering the halls. -50 points for gryffindor");
        points -= 50;
        System.out.println("Harry was being cheeky in class. -3 points for gryffindor");
        points -= 3;
        System.out.println("Hermoine got full marks on Lockhart's quiz. 30 points for gryffindor");
        points += 30;
        System.out.println("Ron won the underground chess game. 60 points for gryffindor");
        points += 100;
        System.out.println("Harry defeated Quirrell");
        points += 60;
        System.out.println(points);
    }

}
