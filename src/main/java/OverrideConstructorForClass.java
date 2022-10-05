/**
 * (1) Create a class with two (overloaded) constructors. Using this, call the
 * second constructor inside the first one
 */
public class OverrideConstructorForClass {
    int number;
    double age;

    public OverrideConstructorForClass() {

    }

    public OverrideConstructorForClass(int number, double age) {
        this.number = number;
        this.age = age;
    }
}
