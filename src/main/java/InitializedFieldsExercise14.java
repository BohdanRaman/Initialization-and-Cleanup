/**
 * Create a class with a static String field that is initialized at the point of
 * definition, and another one that is initialized by the static block.
 * Add a static method that prints both fields and demonstrates that they are both initialized before they are used.
 */

public class InitializedFieldsExercise14 {
    public static String s = "is Cool";
    public static String string;

    static {
        string = "Java ?";
    }

    public static void printStaticFields() {
        System.out.println(s + " " + string);
    }
}
