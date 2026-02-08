package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBB {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com");
        PageObgect obgect=new PageObgect(driver);
        obgect.Username("standard_user");

        driver.findElement(By.xpath (".//input[@type='submit']")).click();
    }
}
