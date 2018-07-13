//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.seleneiumstraight;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    public AppTest() {
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("ChromeDriver", "C:/Drivers/chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://10.9.10.6/sqlite/Main/login.html";
        String expectedTitle = "Cloud9 Airlines";
        driver.get(baseUrl);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title is: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.findElement(By.id("inputEmail")).sendKeys(new CharSequence[]{"wsi@netactive.com"});
        driver.findElement(By.id("inputPassword")).sendKeys(new CharSequence[]{"Password"});
        Thread.sleep(5000L);
        driver.findElement(By.xpath("/html/body/div/form/button")).click();
    }
}