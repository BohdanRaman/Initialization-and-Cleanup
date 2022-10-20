/**
 * Exercise 3: (1) Create a class with a default constructor (one that takes no arguments)
 * that prints a message. Create an object of this class.
 * <p>
 * Exercise 4: (1) Add an overloaded constructor to the previous exercise that takes a
 * String argument and prints it along with your message.
 */

public class ConstructorForTraining {
  String s;

    public ConstructorForTraining() {
        System.out.println("Java is cool");
    }

    public ConstructorForTraining(String s) {
        this.s = s;
    }

    public String printMessage(String s) {
        return s;

    }
}
