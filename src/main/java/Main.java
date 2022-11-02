import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* Task 4*/
        System.out.println("Task 4");
        ConstructorForTrainingExercise4 training = new ConstructorForTrainingExercise4();
        ConstructorForTrainingExercise4 training1 = new ConstructorForTrainingExercise4("This is overloaded constructor");
        training.setString("first message");
        training1.setString("second message");
        System.out.println(training.getString());
        System.out.println(training1.getString() + "\n");

        /* Task 5,6*/
        System.out.println("Task 5,6");
        Dog dog = new Dog();
        System.out.println(dog.toBark(1, "GAF"));
        System.out.println(dog.toBark(2.0, "RRR"));

        Dog newDog = new Dog();
        System.out.println(newDog.toBarkNew(10, "FRR"));
        System.out.println(newDog.toBarkNew("AFAFAF", 100) + "\n");

        /* Task 7*/
        System.out.println("Task 7");
        DefaultConstructorExercise7 defaultConstructor = new DefaultConstructorExercise7();
        defaultConstructor.setCount(1000);
        System.out.println("the default constructor creates the compiler if I didn't create my own;\n" +
                "the no-argument constructor is created by the programmer, and is no longer created by default.\n" +
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
        System.out.println(Arrays.toString(EnumClass.Money.values()) + "\n");
        System.out.println(EnumClass.getMoney(EnumClass.Money.DOLLAR));
        System.out.println(EnumClass.getMoney(EnumClass.Money.EURO));
        System.out.println(EnumClass.getMoney(EnumClass.Money.POUND));
        System.out.println(EnumClass.getMoney(EnumClass.Money.FRANC));
        System.out.println(EnumClass.getMoney(EnumClass.Money.JENA));
        System.out.println(EnumClass.getMoney(EnumClass.Money.YUAN) + "\n");

        for (EnumClass.Money m : EnumClass.Money.values()) {
            System.out.println(m + ": " + m.text);
        }
        System.out.println();

        for (EnumClass.Money money : EnumClass.Money.values()) {
            System.out.println(money + ": " + money.ordinal());
        }

    }
}

