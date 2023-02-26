package by.calculator;

import by.calculator.util.DataProviderForTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemainderTest extends BaseTest {

    @Test(dataProvider = "dataProviderForGettingTheRemainder", dataProviderClass = DataProviderForTests.class,
            description = "The test checks different variations for getting the remainder", priority = 6)
    public void checkRemainder(int a, int b, double expectedResult) {
        Assert.assertEquals(calculator.getTheRemainder(a, b), expectedResult, String.format(MESSAGE, expectedResult));
    }
}
