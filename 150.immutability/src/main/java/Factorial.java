package javax;

public class Factorial {
    public static void main(String[] args) {
        assert(args.length == 1);
        final int n = Integer.parseInt(args[0]);
        assert(n >= 0);

        System.out.println(fac(n));
    }

    private static int fac(final int n) {
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
