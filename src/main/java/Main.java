import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {

        /* Task 4*/
        System.out.println("Task 4");
        ConstructorForTraining training = new ConstructorForTraining();
        ConstructorForTraining training1 = new ConstructorForTraining("Yes, Java is cool");
        System.out.println(training.printMessage("I added method for print text"));
        System.out.println(training1.s + "\n");

        /* Task 5,6*/
        System.out.println("Task 5,6");
        Dog dog = new Dog();
        //  Integer integer = Integer.valueOf("rrrr");
        Double d = new Double("5.0");
        System.out.println(d);
        //   System.out.println(Integer.decode("rrrr"));
        //    System.out.println(dog.toBark("3", "3.3"));


        /* Task 7*/
        System.out.println("Task 7");
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        defaultConstructor.setAnInt(1000);
        System.out.println(defaultConstructor.getAnInt() + "\n");

        /* Task 12*/
        System.out.println("Task 12");
        Tank T90 = new Tank(false, true);
        T90.cleanUpTank();
        T90.fillingUpTank();
        new Tank(false, true);
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

