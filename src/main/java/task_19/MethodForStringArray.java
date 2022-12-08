package task_19;

/**
 * Write a method that takes a vararg String array.
 * Verify that you can pass either a comma-separated list of Strings or a String[] into this method.
 */

public class MethodForStringArray {

    public String[] getArray(String... strings) {

        for (String  str : strings) {
            System.out.println(str);
        }
       return strings;
    }
}
