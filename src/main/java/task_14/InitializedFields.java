package task_14;

/**
 * Create a class with a static String field that is initialized at the point of
 * definition, and another one that is initialized by the static block.
 * Add a static method that prints both fields and demonstrates that they are both initialized before they are used.
 */

public class InitializedFields {
    public static String s = "Today is really good whether";
    public static String string;

    static {
        string = "Yes, it's true ?";
    }

    public static void printStaticFields() {
        System.out.println(s + " " + string);
    }
}
