package classes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.SOURCE)
@Target(value = {ElementType.FIELD, ElementType.METHOD})
public @interface MySecondAnnotation {

}
