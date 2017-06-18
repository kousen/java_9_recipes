import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoTest {
    private Demo demo = new Demo();

    @Test
    public void sayHello() throws Exception {
        assertEquals("Hello, World!", demo.sayHello());
    }

}