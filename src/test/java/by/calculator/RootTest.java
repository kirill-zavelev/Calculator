package by.calculator;

import by.calculator.util.DataProviderForTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RootTest extends BaseTest {

    @Test(dataProvider = "dataProviderForGetTheRoot", dataProviderClass = DataProviderForTests.class,
            description = "The test checks different variations for getting the root", priority = 5)
    public void checkTheRoot(int a, int rootCoefficient, int expectedResult) {
        Assert.assertEquals(calculator.getTheRoot(a, rootCoefficient), expectedResult,
                String.format(MESSAGE, expectedResult));
    }
}
