/**
 * Exercise 7: Create a class without a constructor, and then create an object of that
 * class in main( ) to verify that the default constructor is automatically synthesized.
 */

public class DefaultConstructorExercise7 {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /* the default constructor creates the compiler if I didn't create my own;
    the no-argument constructor is created by the programmer, and is no longer created by default.
    Both constructors take no arguments, but are named differently.*/
}
