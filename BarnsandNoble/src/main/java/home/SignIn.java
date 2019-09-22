package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignIn extends CommonAPI {
    @Test
    public void checkSignInPage() throws InterruptedException{
        driver.findElement(By.cssSelector("#signInLink")).click();
        Thread.sleep(2000);
    }
}
