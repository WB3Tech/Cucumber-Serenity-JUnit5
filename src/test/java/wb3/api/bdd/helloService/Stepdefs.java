package wb3.api.bdd.helloService;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wb3.api.HelloService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stepdefs {

    private HelloService helloService;

    @When("I am greeted")
    public void i_am_greeted() {
        this.helloService = new HelloService();
    }

    @Then("I should hear {string}")
    public void i_should_hear(String greeting) {
        assertEquals(greeting, this.helloService.HowAreYouGreeting());
    }

}
