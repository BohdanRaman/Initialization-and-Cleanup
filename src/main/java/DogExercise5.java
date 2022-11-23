/**
 * Exercise 5: Create a class called Dog with an overloaded bark( ) method.
 * This method should be overloaded based on various primitive data types, and print different types of barking, howling, etc.,
 * depending on which overloaded version is called. Write a main( ) that calls all the different versions.
 * Exercise 6: Modify the previous exercise so that two of the overloaded methods have two arguments (of two different types),
 * but in reversed order relative to each other. Verify that this works.
 */

public class DogExercise5 {

    public String toBark(int i, String bark) {
        return i + " : " + bark;
    }

    public String toBark(double p, String newBark) {
        return p + " : " + newBark;
    }

    public String toBarkNew(String bark, int i) {
        return bark + " : " + i;
    }

    public String toBarkNew(int i, String newBark) {
        return i + " : " + newBark;
    }

    public String toBarkNew(int i, long l) {
        return i + "; " + l;
    }

    public String toBarkNew(long l, int i) {
        return l + "; " + i;
    }
    /* if I use primitive type long and int, I should do types of casting */
}
