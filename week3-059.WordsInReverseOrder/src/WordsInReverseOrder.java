import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String wordTyped = reader.nextLine();
            if (wordTyped.isEmpty()) {
                break;
            }
            words.add(wordTyped);
        }
        Collections.reverse(words);

        for (String eachWord : words) {
            System.out.println(eachWord);
        }

    }
}
