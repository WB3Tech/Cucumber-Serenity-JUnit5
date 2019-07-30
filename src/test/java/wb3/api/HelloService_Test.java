package wb3.api;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HelloService_Test {
    @Test
    public void HelloService_HappyPath() {
        HelloService helloService = new HelloService();
        assertEquals("Hello How Are You?", helloService.HowAreYouGreeting());
    }

}
