package testng.demo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {

    @Test(dataProvider = "DataContainer")
    public void groupDemoCheck(String key, String value) {
        System.out.println(this.getClass().getCanonicalName());
        System.out.println("Key value is: " + key);
        System.out.println("Value is: " + value);

        Assert.assertTrue(true);
    }

    @Test(dataProvider = "InputData", dataProviderClass = TestData.class)
    public void externalDataProviderDemoTest(String key, String value) {
        System.out.println(this.getClass().getCanonicalName());
        System.out.println("Key value is: " + key);
        System.out.println("Value is: " + value);

        Assert.assertTrue(true);
    }

    @DataProvider(name = "DataContainer")
    public Object[][] myDataProvider() {
        return new Object[][]
                {
                        {"Mukesh", "Otwani"},
                        {"Amod", "Mahajan"},
                        {"Animesh", "Prashant"}
                };
    }
}
