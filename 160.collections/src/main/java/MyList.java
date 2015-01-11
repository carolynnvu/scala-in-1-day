package javax;

import java.util.List;
import java.util.ArrayList;

public class MyList {
    public static void main(String[] args) {
        assert(args.length >= 1);

        List digits = new ArrayList();
        for(int i = 0; i < args.length; i++) {
            digits.add(Integer.parseInt(args[i]));
        }

        List reversedDigits = new ArrayList();
        reverse(digits, reversedDigits);
        for(int i = 0; i < reversedDigits.size(); i++) {
            System.out.print(reversedDigits.get(i) + " ");
        }
        System.out.println();
    }

    private static void reverse(final List in, List out) {
        for(int i = 0; i < in.size(); i++) {
            out.add(0, in.get(i));
        }
    }
}
