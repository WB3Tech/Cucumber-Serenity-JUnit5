package wb3.domain.hello;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Hello_Test {

    @Test
    public void Hello_World() {
        Hello hello = new Hello("World");
        assertEquals("Hello World", hello.Greeting());
    }

}
