package classes;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent {
    // предок пугает IOException и InterruptedException
    public void f() throws IOException, InterruptedException {}
}

// Overridden method can't have larger throws
class Child extends Parent {
    // а потомок пугает только потомком IOException
    @Override
    public void f() throws FileNotFoundException {}
}
