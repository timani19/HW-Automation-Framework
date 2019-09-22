package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreditCards extends CommonAPI {
    @Test
    public void testCreaditCardPage() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/header/div/div/div[3]/a/span")).click();
        Thread.sleep(4000);

    }
}
