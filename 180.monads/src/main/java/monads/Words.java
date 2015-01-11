package monads;

import java.io.*;
import java.util.*;

public class Words {
    public static void main(String[] args) throws Exception {
        Set<String> keywords = new HashSet<String>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(Words.class.getResourceAsStream("/keywords.txt")));
            String line;
            while ((line = reader.readLine()) != null) {
                keywords.add(line);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        List<String> words = new LinkedList<String>();
        for (String arg : args) {
            String[] parts = arg.split(" ");
            for (String part : parts) {
                if (part.length() > 0) {
                    words.add(part);
                }
            }
        }

        List<String> foundKeywords = new LinkedList<String>();
        for (String word : words) {
            if (keywords.contains(word.toLowerCase())) {
                foundKeywords.add(word);
            }
        }
        System.out.println("All keywords: " + foundKeywords);

        List<String> upperCaseWords = new LinkedList<String>();
        for (String word : words) {
            upperCaseWords.add(word.toUpperCase());
        }
        System.out.println("All words in uppercase: " + upperCaseWords);
    }
}
