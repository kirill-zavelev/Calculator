package by.calculator;

import org.testng.annotations.*;

public class BaseTest {

    protected static final String MESSAGE = "Result should equals to %s";
    protected Calculator calculator;

    @BeforeSuite
    public void setUpBeforeSuite() {
        System.out.println("The message is displayed before suite started");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownAfterSuite() {
        System.out.println("The message is displayed after suite ended");
    }

    @BeforeTest
    public void setUpBeforeTest() {
        System.out.println("The message is displayed before test started");
    }

    @AfterTest(alwaysRun = true)
    public void tearDownAfterTest() {
        System.out.println("The message is displayed after test ended");
    }

    @BeforeClass(alwaysRun = true)
    public void setUpBeforeClass() {
        calculator = new Calculator();
        System.out.println("The message is displayed before class started");
    }

    @AfterClass(alwaysRun = true)
    public void tearDownAfterClass() {
        calculator = null;
        System.out.println("The message is displayed after class ended");
    }

    @BeforeMethod
    public void setUpBeforeMethod() {
        System.out.println("The message is displayed before method started");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownAfterMethod() {
        System.out.println("The message is displayed after method ended");
    }

    @BeforeGroups
    public void setUpBeforeGroups() {
        System.out.println("The message is displayed before groups started");
    }

    @AfterGroups(alwaysRun = true)
    public void tearDownAfterGroups() {
        System.out.println("The message is displayed after groups ended");
    }
}
