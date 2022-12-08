package task_9;

/**
 * Create a class with two (overloaded) constructors. Using this, call the
 * second constructor inside the first one
 */

public class OverrideConstructorForClass {
    private int number;
    private int age;
    private String s;

    public OverrideConstructorForClass(int number, int age, String s) {
        this(age, number);
        this.s = s;
    }

    public OverrideConstructorForClass(int age, int number) {
        System.out.println(age + " 'age'," + number + " 'number'");
    }
}
