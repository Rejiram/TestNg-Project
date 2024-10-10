package Utilis;

import Base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ListenerClass implements ITestListener, IAnnotationTransformer {
    public void onTestFailure(ITestResult result){
        String filename=System.getProperty("user.dir")+ File.separator+"ScreenShots"+File.separator+result.getMethod();
        File f= ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(f,new File(filename+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
