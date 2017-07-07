package learn.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.PARAMETER})
/**
 * The enum value TYPE_PARAMETER allows an annotation to be applied at type variables
 * (e.g. MyClass<T>). Annotations with target TYPE_USE can be applied at any type use.
 */
public @interface MyAnno {
    String place();

    String setting() default "default setting";

}
