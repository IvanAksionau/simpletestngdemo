package testng.demo;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "InputData")
    public static Object[][] myDataProvider() {
        return new Object[][]
                {
                        {"Mukesh", "Otwani"},
                        {"Amod", "Mahajan"},
                        {"Animesh", "Prashant"}
                };
    }
}
