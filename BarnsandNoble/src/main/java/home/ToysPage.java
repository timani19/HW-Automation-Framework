package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ToysPage extends CommonAPI {
    @Test
    public void testToysPage() throws InterruptedException{
        driver.findElement(By.linkText("Toys")).click();
        Thread.sleep(3000);
    }
}
