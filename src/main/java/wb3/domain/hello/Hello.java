package wb3.domain.hello;

public class Hello {

    private String greeting;

    public Hello(String greeting) {
        this.greeting = greeting;
    }

    public String Greeting() {
        return "Hello " + this.greeting;
    }
}
