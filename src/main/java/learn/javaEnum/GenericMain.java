package learn.javaEnum;



public class GenericMain {
    // psvm + Tab to generate this
    // use T when you need to refer to T later in code
    // use ? on parameter of method
    // ? super Person, set lower bound
    public static void main(String[] args) {
        GenericMain.print(new Integer(3));
        GenericMain.print(new String("string"));
    }

    // need to declare <T> to specify scope
    public static <R> void print(R input) {
        System.out.println(input);
    }
}
