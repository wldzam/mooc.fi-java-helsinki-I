public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        System.out.println("Type integers: ");

        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());
    }
}