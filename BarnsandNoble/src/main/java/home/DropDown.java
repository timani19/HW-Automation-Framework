package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DropDown extends CommonAPI {
    @Test
    public void testDropDownMenu() throws InterruptedException{
        driver.findElement(By.cssSelector("#searchFilterSelect-button-label")).click();
        Thread.sleep(2000);
    }
}
