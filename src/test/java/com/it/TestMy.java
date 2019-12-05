package com.it;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.attribute.standard.Chromaticity;

public class TestMy {
    @Test
    public void test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://maven.apache.org/");
        Thread.sleep(2000);
        Assert.assertEquals("https://maven.apache.org/", driver.getCurrentUrl());
        driver.quit();
    }
    @Test
    public void test2() {

    }
    @Test
    public void test3() {

    }
}
