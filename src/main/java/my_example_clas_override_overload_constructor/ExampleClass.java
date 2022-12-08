package my_example_clas_override_overload_constructor;

public class ExampleClass {
    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExampleClass() {
        System.out.println("Print no-argument constructor. Done!");
    }

    public ExampleClass(int number, String name) {
        number = 100;
        this.name = name;
        System.out.println("Print constructor with argument. Done! Great!!!" + name + " , " + number);
    }

    public ExampleClass(String name, int number) {
        this.number = number;
        this.name = name;
        System.out.println("Print overload constructor with argument. Done! Great!!!" + name + " , " + number);
    }

    public void getText() {
        System.out.println("First text");
    }

    public int getCountMethod(int q) {
        return q;
    }

    public int getCountMethod(int i, int c) {
        return i + c;
    }
}
