package General;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordOccurrences {

    public static void countWords(String given) {

        String[] words = given.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else map.put(words[i], 1);
        }
        map.forEach((key, value) -> System.out.println("occurrences of word  " + key + " is " + value));

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String given = input.nextLine();
        countWords(given);

    }
}
