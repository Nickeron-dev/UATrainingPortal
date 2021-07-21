package classes;

public class Generic<T> {

        T obj;

        Generic(T obj) {
                this.obj = obj;
        }

        public T get() {
                return obj;
        }
}
