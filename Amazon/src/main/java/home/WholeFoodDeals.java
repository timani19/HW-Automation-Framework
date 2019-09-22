package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WholeFoodDeals extends CommonAPI {

    @Test
    public void testWholeFoodDealsPage() {
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)")).click();
    }
}
