package wb3.api;

import wb3.domain.hello.Hello;

public class HelloService {
    public String HowAreYouGreeting() {
        Hello hello = new Hello("How Are You?");
        return hello.Greeting();
    }
}
