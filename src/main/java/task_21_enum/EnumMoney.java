package task_21_enum;

/**
 * Exercise 21: Create an enum of the least-valuable six types of paper currency. Loop
 * through the values( ) and print each value and its ordinal( ).
 * <p>
 * Exercise 22: Write a switch statement for the enum in the previous example. For
 * each case, output a description of that particular currency.
 */

public enum EnumMoney {
    DOLLAR("USA"),                //USA
    EURO("European countries"),   //EUROPE
    POUND("British kingdom"),     //BRITISH
    FRANC("Switzerland"),         //SWISS
    JENA("Japan"),                //JAPAN
    YUAN("Chine");                //CHINESE

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    EnumMoney(String text) {
        this.text = text;
    }

    public static EnumMoney getMoney(EnumMoney bablo) {
        switch (bablo) {
            case DOLLAR -> System.out.println(DOLLAR.getText());
            case EURO -> System.out.println(EURO.getText());
            case POUND -> System.out.println(POUND.getText());
            case FRANC -> System.out.println(FRANC.getText());
            case JENA -> System.out.println(JENA.getText());
            case YUAN -> System.out.println(YUAN.getText());
        }
        return bablo;
    }
}