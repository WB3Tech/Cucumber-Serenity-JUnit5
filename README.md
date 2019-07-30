# Cucumber, Serenity, & JUnit 5

## What Is This?
Integration of Cucumber, Serenity, and JUnit 5. Maven kicks off the unit tests and functional test.
 
JUnit 5 isn't completely implemented.  I'm using the jupiter-vintage-engine for the Cucumber TestRunner classes. 

Instead of using the @ExtendWith(), I'm using the @RunWith(); @ExtendWith() replaces @RunWith in JUnit5. JUnit 5 features are available for the unit tests.
 
I increased the Java version to 12.

### Things I Learned
Setting up this demo was a doozy.  You can read about the issues I faced on stackoverflow: https://stackoverflow.com/questions/57279008/runwithcucumberwithserenity-class-throws-noclassdeffound-cucumber-runtime-jun/57281364#57281364

To ensure this project runs, make sure not to keep the versions as follows:
- serenity-cucumber4 - 1.0.15
- cucumber-java - 4.2.0

### View the Serenity Report
To view the report, you can:

1) View the HTML output at target/site/serenity/index.html
2) Get a csv of the results at target/site/serenity/results.csv
3) View an XML output at target/site/serenity/SERENITY-JUNIT[some-random-uuid]
4) View a summary output at target/site/serenity/summary.txt
