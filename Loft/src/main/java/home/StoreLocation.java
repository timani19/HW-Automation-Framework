package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class StoreLocation extends CommonAPI {
    @Test
    public void CheckStorePage()throws InterruptedException{
        driver.findElement(By.cssSelector("body > header > div > div > div:nth-child(2) > a")).click();
        Thread.sleep(2000);

    }
}
