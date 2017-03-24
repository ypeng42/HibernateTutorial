package reflectionLearn;

import org.reflections.Reflections;

import java.lang.reflect.Method;

class Simple {
    void message() {
        System.out.println("Hello Java");
    }

    void callMessage(String name) {
        System.out.println("Hello Java " + name);
    }
}

public class ReflectionMain {
    public static void main(String args[]){
//        ReflectionMain.createInstance();
        ReflectionMain.invokeMethod();

        // how to scan a package for annotated class
        // see http://stackoverflow.com/questions/259140/scanning-java-annotations-at-runtime
        // google annotation answer
        new Reflections("my.package").getTypesAnnotatedWith(MyAnno.class);


    }

    public static void invokeMethod() {
        try {
            Class c = Class.forName("reflectionLearn.Simple");
            Object o = c.newInstance();
            Method m = c.getDeclaredMethod("callMessage", String.class);
            m.setAccessible(true);
            m.invoke(o, "yes");

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void createInstance() {
        try {
            // need to include the package name (full name)
//            Class c = Class.forName("Simple");

            Class c = Class.forName("reflectionLearn.Simple");
            Simple s = (Simple)c.newInstance();
            s.message();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
