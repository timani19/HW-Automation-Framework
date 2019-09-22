package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLogin extends CommonAPI {

    @Test
    public void testLoginWithInvalidCredentials() throws InterruptedException {
        driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span")).click();
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("@gmail.com");
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("a-list-item"));
        boolean isErrorDisplayed = driver.findElement(By.className("a-list-item")).isDisplayed();
        Assert.assertEquals(isErrorDisplayed, true);
    }
}




