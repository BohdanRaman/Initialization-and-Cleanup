/**
 * Exercise 5: Create a class called Dog with an overloaded bark( ) method.
 * This method should be overloaded based on various primitive data types, and print different types of barking, howling, etc.,
 * depending on which overloaded version is called. Write a main( ) that calls all the different versions.
 * Exercise 6: Modify the previous exercise so that two of the overloaded methods have two arguments (of two different types),
 * but in reversed order relative to each other. Verify that this works.
 */

public class Dog {

    public String toBark(int i, String str1) {

        return i + " : " + str1;
    }

    public String toBark(double p, String s) {
        return p + " : " + s;
    }

    public Object toBarkNew(String srt, int i) {
        return srt + " : " + i;
    }

    public Object toBarkNew(int i, String srt) {
        return i + " : " + srt;
    }
}
