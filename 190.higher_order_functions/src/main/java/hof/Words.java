package hof;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        List<String> words = new LinkedList<String>();
        for (String arg : args) {
            String[] parts = arg.split(" ");
            for (String part : parts) {
                if (part.length() > 0) {
                    words.add(part);
                }
            }
        }

        Map<Character, List<String>> wordsByFirstLetter = new HashMap<Character, List<String>>();
        for (String word : words) {
            Character lowerFirstChar = word.toLowerCase().charAt(0);
            List<String> value = wordsByFirstLetter.get(lowerFirstChar);
            if (value == null) {
                List<String> l = new LinkedList<String>();
                l.add(word);
                wordsByFirstLetter.put(lowerFirstChar, l);
            } else {
                value.add(word);
            }
        }
        System.out.println("Words by first letter: " + wordsByFirstLetter);

        List<String> even = new LinkedList<String>();
        List<String> odd = new LinkedList<String>();
        for (String word : words) {
            if (word.length() % 2 == 0) {
                even.add(word);
            } else {
                odd.add(word);
            }
        }
        System.out.println("Words with even length: " + even);
        System.out.println("Words with odd length: " + odd);

        Map<String, Integer> wordHistogram = new HashMap<String, Integer>();
        for (String word : words) {
            String key = word.toLowerCase();
            Integer value = wordHistogram.get(key);
            if (value == null) {
                wordHistogram.put(key, 1);
            } else {
                wordHistogram.put(key, value + 1);
            }
        }
        System.out.println("Word frequencies: " + wordHistogram);
    }
}
