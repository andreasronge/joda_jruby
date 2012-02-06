package bar;

import junit.framework.TestCase;

public class FooTest extends TestCase {
    public void testGetTime() throws Exception {
        FromJava.getTime();
    }


    public void testFromJRuby() {
        FromRuby.callFromJRuby();
    }


}
