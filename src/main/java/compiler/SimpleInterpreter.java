package compiler;

import java.util.HashMap;
import java.util.Map;

public class SimpleInterpreter {
    public static void main(String[] args) {
        SimplestInterpreter interpreter = new SimplestInterpreter();
        interpreter.interpret("add 1 3");
    }

    public void interpret(String code) {
        Map<String, Integer> values = new HashMap<>();

        for (String line : code.split(";")) {
            for (String token : line.split(" ")) {

            }
        }

//        String[] arg  = input.split(" ");
//
//        String inst = arg[0];
//        Integer arg1 = Integer.parseInt(arg[1]);
//        Integer arg2 = Integer.parseInt(arg[2]);
//        Integer result = 0;
//
//        if (inst.compareToIgnoreCase("add") == 0) {
//            result = arg1 + arg2;
//        } else if (inst.compareToIgnoreCase("mul") == 0) {
//            result = arg1 * arg2;
//        }
//
//        System.out.println(result);
    }
}
