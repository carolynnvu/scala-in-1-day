package javax;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        Set<String> keywords = new HashSet<String>();
        keywords.add("scala");
        keywords.add("rocks");

        List<String> words = new LinkedList<String>();
        for (String arg : args) {
            String[] parts = arg.split(" ");
            for (String part : parts) {
                if (part.length() > 0) {
                    words.add(part);
                }
            }
        }

        if (words.size() == 0) {
            System.out.println("No words!");
        } else {
            System.out.println("First word is " + words.get(0));
            StringBuilder b = new StringBuilder();
            for (int i = 1; i < words.size(); i++) {
                if (i != 1) b.append(",");
                b.append(words.get(i));
            }
            System.out.println("Remaining words are " + b.toString());
        }

        boolean found = false;
        for (String word : words) {
            if (keywords.contains(word.toLowerCase())) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Words contain keywords");
        } else {
            System.out.println("No keywords found");
        }

        if (words.size() > 0) {
            boolean ok = true;
            for (String word : words) {
                if (!keywords.contains(word.toLowerCase())) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println("Words contain only keywords");
            } else {
                System.out.println("Non-keywords found");
            }
        }

        String firstKeyword = null;
        String firstNonKeyword = null;
        for (String word : words) {
            if (keywords.contains(word.toLowerCase())) {
                if (firstKeyword == null) {
                    firstKeyword = word;
                }
            } else {
                if (firstNonKeyword == null) {
                    firstNonKeyword = word;
                }
            }
            if (firstKeyword != null && firstNonKeyword != null) {
                break;
            }
        }
        System.out.println("First keyword " + (firstKeyword == null ? "not found" : firstKeyword));
        System.out.println("First non-keyword " + (firstNonKeyword == null ? "not found" : firstNonKeyword));
    }
}
