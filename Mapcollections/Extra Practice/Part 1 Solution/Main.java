public class Main {
    public static void main(String[] args) {
        City city1 = new City("New York", "USA", 8500000);
        System.out.println(city1.getName());

        city1.setName("");

        city1.setCountry("");

        city1.setPopulation(-1);

       / City city2 = new City("", "USA", 8500000);
    }
}
