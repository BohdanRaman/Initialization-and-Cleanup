import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* Task 4*/
        System.out.println("Task 4");
        ConstructorForTraining training = new ConstructorForTraining();
        ConstructorForTraining training1 = new ConstructorForTraining("Yes, Java is cool");
        System.out.println(training1.s);
        System.out.println(training.s + "\n");

        /* Task 5,6*/
        System.out.println("Task 5,6");
        Dog dog = new Dog();
        //  Integer integer = Integer.valueOf("rrrr");
        Double d = new Double("5.0");
        System.out.println(d);
        //   System.out.println(Integer.decode("rrrr"));
        //    System.out.println(dog.toBark("3", "3.3"));


        /* Task 7*/
        DefaultConstructor defaultConstructor = new DefaultConstructor();

        /* Task 12*/
        System.out.println("Task 12");
        Tank T90 = new Tank(false, true);
        T90.cleanUpTank();
        T90.fillingUpTank();
        new Tank(false,true);
        System.gc();

        /* Task 14*/
        System.out.println("Task 14");
        System.out.println(InitializedFields.string + " " + InitializedFields.s);
        InitializedFields.printStaticFields();

        /* Task 19*/
        System.out.println("Task 19");
        MethodForStringArray stringArray = new MethodForStringArray();
        //    System.out.println(Arrays.toString(stringArray.getArray("string")));
    }
}
