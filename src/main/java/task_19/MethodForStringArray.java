package task_19;

/**
 * Write a method that takes a vararg String array.
 * Verify that you can pass either a comma-separated list of Strings or a String[] into this method.
 */

public class MethodForStringArray {

    public void getArray(String... strings) {
        if (strings != null)
            for (String s : strings) {
                System.out.println(s);
            }
    }
}
