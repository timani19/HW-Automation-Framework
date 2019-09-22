package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver=null;

    @Parameters({"url"})

    @BeforeMethod
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\imani\\IdeaProjects\\Selenium-Web-Automation\\Generic\\browser driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.navigate().to(url);

    }

    public void sleepFor(int sec){
        try {
            Thread.sleep(8000*1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

}
