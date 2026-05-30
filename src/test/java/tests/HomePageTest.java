package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageLoads() {
        driver.get("http://localhost:5173");
        Assert.assertFalse(driver.getTitle().isEmpty());
    }
}