/**
 * Exercise 3: (1) Create a class with a default constructor (one that takes no arguments)
 * that prints a message. Create an object of this class.
 * <p>
 * Exercise 4: (1) Add an overloaded constructor to the previous exercise that takes a
 * String argument and prints it along with your message.
 */

public class ConstructorForTrainingExercise4 {
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public ConstructorForTrainingExercise4() {
        System.out.println("Java is cool");
    }

    public ConstructorForTrainingExercise4(String text) {
        this.string = text;
    }

}
