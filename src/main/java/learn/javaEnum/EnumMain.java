package learn.javaEnum;

enum ColorEnum {
    RED,
    BLUE,
    YELLOW;
}

enum ComplexColorEnum {
    RED("red"),
    BLUE("blue"),
    YELLOW("yellow");

    // we can associate more information with enum, enum is not just a simple string representation of an Int
    // for example, earth, moon, etc
    private String colorText;

    ComplexColorEnum(String colorText) {
        this.colorText = colorText;
    }

    void printText() {
        System.out.println("Text is " + colorText);
    }
}

public class EnumMain {
    public static void main(String args[]){
        EnumMain.complexEnum();
    }

    public static void complexEnum() {
        ComplexColorEnum c = ComplexColorEnum.BLUE;
        c.printText();
    }

    public static void simpleEnum() {
        ColorEnum c = ColorEnum.BLUE;
        System.out.println(c);
    }
}
