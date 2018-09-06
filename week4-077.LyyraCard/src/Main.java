
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code
        LyyraCard Pekka = new LyyraCard(20);
        LyyraCard Brian = new LyyraCard(30);
        Pekka.payGourmet();
        Brian.payEconomical();
        System.out.println("Pekka: " + Pekka.toString());
        System.out.println("Brian: " + Brian.toString());
        Pekka.loadMoney(20.0);
        Brian.payGourmet();
        System.out.println("Pekka: " + Pekka.toString());
        System.out.println("Brian: " + Brian.toString());
        Pekka.payEconomical();
        Pekka.payEconomical();
        Brian.loadMoney(50.0);
        System.out.println("Pekka: " + Pekka.toString());
        System.out.println("Brian: " + Brian.toString());

        //test

//        LyyraCard test = new LyyraCard(100.0);
//        test.loadMoney(51);
//        System.out.println("Test: " + test.toString());
    }
}
