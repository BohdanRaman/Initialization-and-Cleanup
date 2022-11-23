import my_example_clas_override_overload_constructor.ExampleClass;
import my_example_clas_override_overload_constructor.SecondExampleClass;
import task_21_enum.EnumMoney;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* Task 4*/
        System.out.println("Task 4");
        ConstructorForTrainingExercise4 constructor = new ConstructorForTrainingExercise4("\"My text\" with my previous message");
        System.out.println(constructor.getString() + "\n");
        /* I used  "\n" for separation output between tasks in  console. I can written empty sout.*/

        /* Task 5,6*/
        System.out.println("Task 5,6");
        DogExercise5 dog = new DogExercise5();
        System.out.println(dog.toBark(1, "GAF"));
        System.out.println(dog.toBark(2.0, "RRR"));

        DogExercise5 newDog = new DogExercise5();
        System.out.println(newDog.toBarkNew(10, "Bark"));
        System.out.println(newDog.toBarkNew("Bark", 10));

        System.out.println(newDog.toBarkNew(55L, 155));             // types of casting
        System.out.println(newDog.toBarkNew(155L, 55) + "\n");       // types of casting

        /* Task 7*/
        System.out.println("Task 7");
        DefaultConstructorExercise7 defaultConstructor = new DefaultConstructorExercise7();
        defaultConstructor.setCount(1000);
        System.out.println("""
                The default constructor creates the compiler, if I can't create my own;
                If the no-argument constructor is created by me, he is no longer created by default.
                Both constructors take no arguments, but are named differently""");
        System.out.println(defaultConstructor.getCount() + "\n");

        /* Task 12*/
        System.out.println("Task 12");
        TankExercise12 T90 = new TankExercise12(true, true);
        T90.cleanUpTank();
        T90.fillingUpTank();
        T90.finalize();
        System.gc();
        System.out.println();

        /* Task 14*/
        System.out.println("Task 14");
        System.out.println(InitializedFieldsExercise14.string + " " + InitializedFieldsExercise14.s);
        InitializedFieldsExercise14.printStaticFields();
        System.out.println();

        /* Task 19*/
        System.out.println("Task 19");
        MethodForStringArrayExercise19 stringArray = new MethodForStringArrayExercise19();
        System.out.println(Arrays.toString((stringArray.getArray("I", "LOVE", "MY", "LIFE"))) + "\n");

        /* Task 22*/
        System.out.println("Task 22");
        System.out.println(Arrays.toString(EnumMoney.values()) + "\n");
        for (EnumMoney money : EnumMoney.values()) {
            System.out.println(money + ", ordinal number: " + money.ordinal());
        }
        System.out.println();

        for (EnumMoney enumMoney : EnumMoney.values()) {
            System.out.println(enumMoney + ": " + enumMoney.getText());
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(EnumMoney.getMoney(EnumMoney.DOLLAR));
        System.out.println(EnumMoney.getMoney(EnumMoney.EURO));
        System.out.println(EnumMoney.getMoney(EnumMoney.POUND));
        System.out.println(EnumMoney.getMoney(EnumMoney.FRANC));
        System.out.println(EnumMoney.getMoney(EnumMoney.JENA));
        System.out.println(EnumMoney.getMoney(EnumMoney.YUAN));
        System.out.println();

        System.out.println("My example class:");
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

