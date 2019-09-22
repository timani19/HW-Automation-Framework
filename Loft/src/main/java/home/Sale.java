package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Sale extends CommonAPI {
    @Test
    public void checkSalePage() throws InterruptedException{
        driver.findElement(By.cssSelector("#catl00008 > strong")).click();
        Thread.sleep(4000);

    }
}
