package classes;

public @interface MyAnnotation {
        public int value();

        public String description() default "";
}
