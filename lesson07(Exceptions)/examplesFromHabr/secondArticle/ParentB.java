package classes;

import java.io.IOException;

public class ParentB {
    public void f() throws IOException, InterruptedException {}
}

class ChildB extends Parent {
    // Overridden method can't have larger throw than this method in superclass
    @Override
    public void f() throws Exception {}
}
