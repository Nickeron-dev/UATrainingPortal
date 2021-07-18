package classes;

import java.lang.reflect.Method;

@MyAnnotation(value = 122, description = "Description to Class")
public class UsingMyAnnotation {
        @MyAnnotation(value = 123, description = "This is John")
        public UsingMyAnnotation() {
                System.out.println("This is constructor!");
        }

        @MyAnnotation(100)
                public void someMethod2() {
        }

}
