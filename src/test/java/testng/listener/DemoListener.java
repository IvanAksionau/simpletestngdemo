package testng.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoListener implements ITestListener {

    //You can implement any method from ITestListener.class,
    // but full implementation is not required as all methods are with 'default' definition

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart method from listener is executed!!!!!!!!");
    }
}
