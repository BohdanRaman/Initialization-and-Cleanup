/**
 * Exercise 21: Create an enum of the least-valuable six types of paper currency. Loop
 * through the values( ) and print each value and its ordinal( ).
 * <p>
 * Exercise 22: Write a switch statement for the enum in the previous example. For
 * each case, output a description of that particular currency.
 */

public class EnumClassExercise21 {


    enum Money {
        DOLLAR("USA"),                //USA
        EURO("European countries"),   //EUROPE
        POUND("British kingdom"),     //BRITISH
        FRANC("Switzerland"),         //SWISS
        JENA("Japan"),                //JAPAN
        YUAN("Chine");                //CHINESE

        public String text;

        Money(String text) {
            this.text = text;
        }

    }

    public static Money getMoney(Money bablo) {
        switch (bablo) {
            case DOLLAR -> System.out.println("This money is USA");
            case EURO -> System.out.println("This money is European countries");
            case POUND -> System.out.println("This money is British kingdom");
            case FRANC -> System.out.println("This money is Switzerland");
            case JENA -> System.out.println("This money is Japan");
            case YUAN -> System.out.println("This money is Chine");
        }
        return bablo;
    }
}
