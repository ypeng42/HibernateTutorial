package reflectionLearn;


import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class AnnotationMain {
    public static void main(String[] args) {
        // The other 2 ways to get class
        // 1. Class.forName("xx.xx.MyClass")
        // 2. obj.getClass()

        // when making change to custom annotation, be sure to update student class file, otherwise change
        // may not be picked up. The change will make ide update the student class bytecode ?
        // there is some wired shit with annotation and retention policy...
        // delete target folder laos helps
        Class<Student> obj = Student.class;

        // Note: annotation element can only be primitive type

        // Get a specific annotation to get it's value
        MyAnno a = obj.getAnnotation(MyAnno.class);
        System.out.println(a.place());

        for (Method method : obj.getMethods()) {
            if (method.isAnnotationPresent(SpecialMethod.class)) {
                System.out.println("Special method is " + method.getName());

//                MyAnno ann = method.getAnnotation(MyAnno.class);
//                System.out.println(ann.place());

                System.out.println("return value setting: " +
                        method.getAnnotatedReturnType().getAnnotation(MyAnno.class).place());

                /*
                 * If annotation is not applicable for Type Annotation (turn on TYPE_USE)
                 * The followings are equivalent:
                 *
                 * public @MyAnno String foo() {}
                 * is the same as
                 *
                 * @MyAnno
                 * public String foo() {}
                 *
                 */


                for (Parameter p : method.getParameters()) {
                    if (p.isAnnotationPresent(MyAnno.class)) {
                        MyAnno an = p.getAnnotation(MyAnno.class);
                        System.out.println("The param: " + p.getName() + " has annotation value " + an.place());
                    }
                }
            }
        }

    }
}
