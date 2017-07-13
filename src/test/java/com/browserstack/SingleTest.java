package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;
// import org.testng.annotations.Parameters;


public class SingleTest extends BrowserStackTestNGTest {

    @Test
    // @Parameters({"browser"})
    public void test() throws Exception { /*Add variable String browser as a parameter in the test  method */ 
        driver.get("https://www.google.com/ncr");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("BrowserStack");
        element.submit();
        Thread.sleep(5000);

        Assert.assertEquals("BrowserStack - Google Search", driver.getTitle());
    }
}
