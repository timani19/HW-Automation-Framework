package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClothingPage extends CommonAPI {
    @Test
    public void testClothingPage()throws InterruptedException{
        driver.findElement(By.cssSelector("#catl00002 > strong")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#cat0 > a:nth-child(2)")).click();
        Thread.sleep(3000);
    }
}
