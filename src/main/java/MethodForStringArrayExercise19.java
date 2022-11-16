/**
 * Write a method that takes a vararg String array.
 * Verify that you can pass either a comma-separated list of Strings or a String[] into this method.
 */

public class MethodForStringArrayExercise19 {

    public String[] getArray(String... strings) {

        for (String str : strings) {
            System.out.println(str);
        }
        return strings;
        /* if I put null, I'll get NullPointerException. But I can cast null to String*/
    }
}
