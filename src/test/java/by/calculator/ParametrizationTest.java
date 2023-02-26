package by.calculator;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationTest extends BaseTest {

    @Parameters({"a", "b", "expectedResult"})
    @Test()
    public void checkParametrization(@Optional("5") int a, @Optional("2") int b, @Optional("7") int expectedResult) {
        Assert.assertEquals(calculator.sum(a, b), expectedResult, String.format(MESSAGE, expectedResult));
    }
}
