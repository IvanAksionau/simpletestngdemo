package testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDemoTest {

    @Test(groups = {"Smoke"})
    public void groupDemoCheck() {
        System.out.println(this.getClass().getCanonicalName());
        Assert.assertTrue(true);
    }
}
