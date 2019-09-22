package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSell extends CommonAPI {
    @Test
    public void testLoginWithValidCredentials() throws InterruptedException{
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(8)")).click();
        Thread.sleep(4000);

    }
}
