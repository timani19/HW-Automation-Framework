package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchBox extends CommonAPI {
    @Test
    public void testSearchBox()throws InterruptedException{
        driver.findElement(By.cssSelector("#search-toggle")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#endeca-search-bar-frame > span > div > input")).sendKeys("dresses");
        driver.findElement(By.cssSelector("#endeca-search-bar-frame > a.search3")).click();
        Thread.sleep(3000);

    }
}
