package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchBoxTest extends CommonAPI {
    @Test
    public void testSearchBox()throws InterruptedException{
        driver.findElement(By.id("searchBarBN")).sendKeys("headfirst java");
        driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[2]")).click();
        Thread.sleep(3000);

    }
}
