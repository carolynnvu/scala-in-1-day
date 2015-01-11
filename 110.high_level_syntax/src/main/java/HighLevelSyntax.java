package javax;

public class HighLevelSyntax {
    private static String buildString(final String one, final String two) {
	return one + " " + two;
    }

    public static void main(String[] args) {
	final String hello = "Hello";
	String world = "World!";

	if(args.length == 1) {
	    world = args[0];
	}

	System.out.println(buildString(hello, world));
    }
}
