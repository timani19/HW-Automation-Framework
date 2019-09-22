package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckSaleItems extends CommonAPI {
    @Test
    public void testSaleItemsPage() throws InterruptedException{
        driver.findElement(By.linkText("Sale")).click();
        Thread.sleep(3000);
    }
}
