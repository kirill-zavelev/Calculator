package by.calculator;

import by.calculator.util.DataProviderForTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivideTest extends BaseTest {

    @Test(dataProvider = "dataProviderForDivision", dataProviderClass = DataProviderForTests.class,
            description = "The test checks different variations of division", priority = 2, invocationCount = 2)
    public void checkDivision(int a, int b, double expectedResult) {
        Assert.assertEquals(calculator.divide(a, b), expectedResult, String.format(MESSAGE, expectedResult));
    }
}
