import my_example_clas_override_overload_constructor.ExampleClass;
import my_example_clas_override_overload_constructor.SecondExampleClass;
import taks_4.ConstructorForTraining;
import task_12.Tank;
import task_21_enum.EnumMoney;
import task_5.Dog;
import task_7.DefaultConstructor;
import task_9.OverrideConstructorForClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* Task 4*/
        System.out.println("Task 4");
        ConstructorForTraining constructor = new ConstructorForTraining("\"My text\" with my previous message");
        System.out.println(constructor.getString() + "\n");
        /* I used  "\n" for separation output between tasks in console. I can written empty sout.*/

        /* Task 5,6*/
        System.out.println("Task 5,6");
        Dog dog = new Dog();
        System.out.println(dog.toBark(1, "GAF"));
        System.out.println(dog.toBark(2.0, "RRR"));

        Dog newDog = new Dog();
        System.out.println(newDog.toBarkNew(10, "Bark"));
        System.out.println(newDog.toBarkNew("Bark", 10));

        System.out.println(newDog.toBarkNew(55L, 155));              // types of casting
        System.out.println(newDog.toBarkNew(155L, 55) + "\n");       // types of casting

        /* Task 7*/
        System.out.println("Task 7");
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        defaultConstructor.setCount(1000);
        System.out.println("""
                The default constructor creates the compiler, if I can't create my own;
                If the no-argument constructor is created by me, he is no longer created by default.
                Both constructors take no arguments, but are named differently""");
        System.out.println(defaultConstructor.getCount() + "\n");

        /* Task 9*/
        System.out.println("Task 9");
        OverrideConstructorForClass constructorForClass = new OverrideConstructorForClass(2,23);
        System.out.println();

        /* Task 12*/
        System.out.println("Task 12");
        Tank T90 = new Tank(true, true);
        T90.cleanUpTank();
        T90.fillingUpTank();
        T90.finalize();
        System.gc();
        System.out.println();

        /* Task 14*/
        System.out.println("Task 14");
        System.out.println(InitializedFields.string + " " + InitializedFields.s);
        InitializedFields.printStaticFields();
        System.out.println();

        /* Task 19*/
        System.out.println("Task 19");
        MethodForStringArray stringArray = new MethodForStringArray();
        //  System.out.println(Arrays.toString((stringArray.getArray("I", "LOVE", "MY", "LIFE"))) + "\n");

        /* Task 22*/
        System.out.println("Task 22");
        System.out.println(Arrays.toString(EnumMoney.values()) + "\n");
        System.out.println(EnumMoney.getMoney(EnumMoney.DOLLAR));
        System.out.println(EnumMoney.getMoney(EnumMoney.EURO));
        System.out.println(EnumMoney.getMoney(EnumMoney.POUND));
        System.out.println(EnumMoney.getMoney(EnumMoney.FRANC));
        System.out.println(EnumMoney.getMoney(EnumMoney.JENA));
        System.out.println(EnumMoney.getMoney(EnumMoney.YUAN) + "\n");

        for (EnumMoney m : EnumMoney.values()) {
            System.out.println(m + ": " + m);
        }
        System.out.println();

        for (EnumMoney money : EnumMoney.values()) {
            System.out.println(money + ": " + money.ordinal());
        }
        System.out.println();

        System.out.println("My example class" + " \n");
        ExampleClass example = new ExampleClass();
        ExampleClass example1 = new ExampleClass(example.getNumber(), "one");
        ExampleClass example2 = new ExampleClass("two", 1);
        System.out.println("Print method and return: " + example2.getCountMethod(1));
        System.out.println("Print overload method and return: " + example2.getCountMethod(1, 1));
        example.getText();
        SecondExampleClass secondClass = new SecondExampleClass();
        System.out.println(secondClass.getCountMethod(5, 5));
        System.out.println(secondClass.getCountMethod(10));
        secondClass.getText();
    }
}

