package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestRegistry extends CommonAPI {
    @Test
    public void testRegistryPage () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
        Thread.sleep(4000);

    }
}
