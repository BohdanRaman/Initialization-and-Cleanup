package my_example_clas_override_overload_constructor;

public class SecondExampleClass extends ExampleClass {

    @Override
    public int getCountMethod(int i, int c) {
        System.out.println("Override method getCount with two arguments");
        return i * c;
    }

    @Override
    public int getCountMethod(int q) {
        System.out.println("Override method getCount with one argument");
        return q * 2;
    }

    @Override
    public void getText() {
        System.out.println("Second text, override method with print some text");
    }
}
