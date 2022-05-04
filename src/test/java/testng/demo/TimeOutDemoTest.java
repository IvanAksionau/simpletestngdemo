package testng.demo;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TimeOutDemoTest {

    @Test(groups = {"Smoke"})
    public void timeOutDemoTestCheck() {
        System.out.println(this.getClass().getCanonicalName());
    }

    @Test
    public void timeOutDemoTestCheck2() {

    }

    @Test(timeOut = 1000, expectedExceptions = ThreadTimeoutException.class)
    public void timeOutDemoTestCheck3() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("The expected exception was thrown, as the test timeout was exited");
    }
}
