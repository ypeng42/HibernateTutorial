package compiler;

public class SimplestInterpreter {
    public static void main(String[] args) {
        SimplestInterpreter interpreter = new SimplestInterpreter();
        interpreter.interpret("add 1 3");
    }

    public void interpret(String code) {
        // 1. parse
        String[] tokens = code.split(" ");

        String inst = tokens[0];
        Integer arg1 = Integer.parseInt(tokens[1]);
        Integer arg2 = Integer.parseInt(tokens[2]);

        // 2. interpret token's meaning and execute
        Integer result = 0;
        if (inst.compareToIgnoreCase("add") == 0) {
            result = arg1 + arg2;
        } else if (inst.compareToIgnoreCase("mul") == 0) {
            result = arg1 * arg2;
        }

        System.out.println(result);
    }
}
