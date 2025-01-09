package Boolean;

public class Workbook33 {
    public static void main(String[] args) {
        int griffindor = 400;
        int ravenclaw = 200;
        int pointsmargin = griffindor-ravenclaw;
        if(pointsmargin >= 300){
            System.out.println("Griffindor takes the house cup!");
        }
        else if(pointsmargin >= 0) {
            System.out.println("In second place, Gryffindor!");
        }
        else if(pointsmargin >= -100){
            System.out.println("In third place, Gryffindor!");
        }
        else{
            System.out.println("In fourth place,Gryffindor!");
        }


    }
}
