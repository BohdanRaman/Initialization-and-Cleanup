import my_example_clas_override_overload_constructor.ExampleClass;
import my_example_clas_override_overload_constructor.SecondExampleClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* Task 4*/
        System.out.println("Task 4");
        ConstructorForTrainingExercise4 constructor = new ConstructorForTrainingExercise4("'My text' with my previous message");
        System.out.println(constructor.getString() + "\n");

        /* Task 5,6*/
        System.out.println("Task 5,6");
        DogExercise5 dog = new DogExercise5();
        System.out.println(dog.toBark(1, "GAF"));
        System.out.println(dog.toBark(2.0, "RRR"));

        DogExercise5 newDog = new DogExercise5();
        System.out.println(newDog.toBarkNew(10, "Bark"));
        System.out.println(newDog.toBarkNew("Bark", 10) + "\n");

        /* Task 7*/
        System.out.println("Task 7");
        DefaultConstructorExercise7 defaultConstructor = new DefaultConstructorExercise7();
        defaultConstructor.setCount(1000);
        System.out.println("The default constructor creates the compiler, if I can't create my own;\n" +
                "If the no-argument constructor is created by me, he is no longer created by default.\n" +
                "Both constructors take no arguments, but are named differently");
        System.out.println(defaultConstructor.getCount() + "\n");

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
        System.out.println(Arrays.toString((stringArray.getArray("I", "LOVE", "MY", "LIFE"))) + "\n");

        /* Task 22*/
        System.out.println("Task 22");
        System.out.println(Arrays.toString(EnumClassExercise21.Money.values()) + "\n");
        System.out.println(EnumClassExercise21.getMoney(EnumClassExercise21.Money.DOLLAR));
        System.out.println(EnumClassExercise21.getMoney(EnumClassExercise21.Money.EURO));
        System.out.println(EnumClassExercise21.getMoney(EnumClassExercise21.Money.POUND));
        System.out.println(EnumClassExercise21.getMoney(EnumClassExercise21.Money.FRANC));
        System.out.println(EnumClassExercise21.getMoney(EnumClassExercise21.Money.JENA));
        System.out.println(EnumClassExercise21.getMoney(EnumClassExercise21.Money.YUAN) + "\n");

        for (EnumClassExercise21.Money m : EnumClassExercise21.Money.values()) {
            System.out.println(m + ": " + m.text);
        }
        System.out.println();

        for (EnumClassExercise21.Money money : EnumClassExercise21.Money.values()) {
            System.out.println(money + ": " + money.ordinal());
        }
        System.out.println();

        System.out.println("My example class" +" \n");
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

