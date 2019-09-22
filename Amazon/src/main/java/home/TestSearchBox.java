package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSearchBox extends CommonAPI {

    @Test
    public void testSearchBox() {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
    }

}
