# Cucumber, Serenity, & JUnit 5

## What Is This?

I wanted to see how to integrate Cucumber, Serenity, and JUnit 5.  

The goal was to have maven kick off the unit tests and BDD test. So far, the units tests work.

The BDD tests are not working, and when I get them to work, their outcomes are not being reported via Serenity.

### Help!!!

Problem: When you run `mvn clean verify` on this project you get the following error:

`HelloService_BDD » NoClassDefFound cucumber/runtime/junit/Assertions`

If you change the `@RunWith(CucumberWithSerenity.class)` to `@RunWith(Cucumber.class)` in HelloService_BDD class, the error disappears and the tests run.  Although, as stated above, the results are not reported.


