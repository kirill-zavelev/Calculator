package by.calculator.util;


import org.testng.annotations.DataProvider;

public class DataProviderForTests {

    @DataProvider(name = "dataProviderForDivision")
    public static Object[][] dataProviderForDivision() {
        return new Object[][]{
                {1, 0, Double.POSITIVE_INFINITY},
                {-1, 0, Double.NEGATIVE_INFINITY},
                {0, 1, 0},
                {1, 1, 1.0},
                {-1, -1, 1.0},
                {-2, 1, -2.0},
                {5, 2, 2.5}
        };
    }

    @DataProvider(name = "dataProviderForMultiplyOfIntegers")
    public static Object[][] dataProviderForMultiplyOfIntegers() {
        return new Object[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1},
                {-1, -1, 1},
                {-2, 1, -2}
        };
    }

    @DataProvider(name = "dataProviderForGettingTheRemainder")
    public static Object[][] dataProviderForRemainder() {
        return new Object[][]{
                {1, 1, 0.0},
                {2, 1, 0.0},
                {2, 2, 0.0},
                {-10, 2, 0.0},
                {-10, 3, -1.0},
                {-10, -3, -1.0},
                {15, 4, 3.0}
        };
    }

    @DataProvider(name = "dataProviderForGetTheRoot")
    public static Object[][] dataProviderForGetTheRoot() {
        return new Object[][]{
                {2, 0, 1},
                {1, 10, 1},
                {2, 2, 4},
                {2, 3, 8}
        };
    }

    @DataProvider(name = "dataProviderForSubtractOfIntegers")
    public static Object[][] dataProviderForSubtractOfIntegers() {
        return new Object[][]{
                {0, 0, 0},
                {0, 1, -1},
                {1, -1, 2},
                {-1, -1, 0},
                {-2, 1, -3},
                {2, -1, 3}
        };
    }

    @DataProvider(name = "dataProviderForSumOfIntegers")
    public static Object[][] dataProviderForSumOfIntegers() {
        return new Object[][]{
                {0, 0, 0},
                {0, 1, 1},
                {1, 1, 2},
                {1, -1, 0},
                {-1, -1, -2},
                {-2, 1, -1},
                {2, -1, 1}
        };
    }
}
