public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter count = new Counter(true);
        System.out.println(count.value());
        count.decrease();
        System.out.println(count.value());
    }
}
