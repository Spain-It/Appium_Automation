package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class RealMobileTest {


    @Test
    public void samsungj7() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","9");
        desiredCapabilities.setCapability("deviceName","SM-J701F/DS");
        desiredCapabilities.setCapability("udid","5200b066f475745d");
        desiredCapabilities.setCapability("appPackage","com.sec.android.app.popupcalculator");
        desiredCapabilities.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);

        WebElement numara9 = driver.findElement(By.xpath("//*[@index='6']"));
        WebElement numara8 = driver.findElement(By.xpath("//*[@index='5']"));
        WebElement numara7 = driver.findElement(By.xpath("//*[@index='4']"));
        WebElement numara6 = driver.findElement(By.xpath("//*[@index='10']"));
        WebElement numara5 = driver.findElement(By.xpath("//*[@index='9']"));
        WebElement numara4 = driver.findElement(By.xpath("//*[@index='8']"));

        WebElement carpma =driver.findElement(By.xpath("//*[@index='7']"));
        WebElement esittir =driver.findElement(By.xpath("//*[@index='19']"));
        WebElement netice =driver.findElement(By.xpath("//*[@index='0']"));

        numara9.click();
        numara8.click();
        numara7.click();
        carpma.click();
        numara6.click();
        numara5.click();
        numara4.click();
        esittir.click();
        Thread.sleep(3000);
        System.out.println(netice.getText());
    }
}
