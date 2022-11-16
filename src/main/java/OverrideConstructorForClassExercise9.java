/**
 * Create a class with two (overloaded) constructors. Using this, call the
 * second constructor inside the first one
 */

public class OverrideConstructorForClassExercise9 {
    int number;
    int age;
    String s;

    public OverrideConstructorForClassExercise9(int number, int age, String s) {
        this(age, number);
        this.s = s;
    }

    public OverrideConstructorForClassExercise9(int age, int number) {
    }
}
