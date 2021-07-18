package classes;

// @MySecondAnnotation // impossible since, target method and field
public class UsingMySecondAnnotation {

        @MySecondAnnotation
        private int value = 100;

        @MySecondAnnotation
        public void method() {

        }
}
