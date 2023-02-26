package by.calculator;

import by.calculator.util.DataProviderForTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractTest extends BaseTest {

    @Test(groups = {"smoke"}, dataProvider = "dataProviderForSubtractOfIntegers",
            dataProviderClass = DataProviderForTests.class,
            description = "The test checks different variations for subtract of integers", priority = 4)
    public void checkSubtraction(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.subtract(a, b), expectedResult, String.format(MESSAGE, expectedResult));
    }
}
