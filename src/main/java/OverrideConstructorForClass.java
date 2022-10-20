/**
 * Create a class with two (overloaded) constructors. Using this, call the
 * second constructor inside the first one
 */

public class OverrideConstructorForClass {
    int number;
    int age;
    String s;

    public OverrideConstructorForClass(int number, int age, String s) {
        this(age, number);
        this.s = s;
    }

    public OverrideConstructorForClass(int age, int number) {
    }
}
