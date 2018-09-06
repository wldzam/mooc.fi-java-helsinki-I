public class Main {
  public static void main(String[] args) {
    Person pekka = new Person("Pekka", 15, 2, 1993);
    Person steve = new Person("Thomas", 1, 3, 1955);
    Person jeff = new Person("Jeff", new MyDate(4, 9,  1988));

    System.out.println( steve.getName() + " age " + steve.age() + " years");
    System.out.println( pekka.getName() + " age " + pekka.age() + " years");
    System.out.println(jeff.getName() + " age " + jeff.age() + " years");
  }
}