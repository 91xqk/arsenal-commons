package org.sunny.arsenal;



import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.ANNOTATION_TYPE)
public @interface LoginFilter {
    public boolean value() default true;
}
