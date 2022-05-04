package testng.demo;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamDemoTest {

//    @Ignore
    @Parameters({"URL","API"})
    @Test(groups = {"Smoke"})
    public void paramDemoCheck(String url, String api) {
        System.out.println(this.getClass().getCanonicalName());
        System.out.println(url);
        System.out.println(api);
        Assert.assertTrue(true);
    }
}
