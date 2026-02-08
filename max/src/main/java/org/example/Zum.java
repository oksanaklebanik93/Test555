package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zum {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.xpath(".//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath(".//input[@id='login-button']")).click();

        driver.get("https://ek.ua/ua/");
        driver.findElement(By.xpath(".//input[@id='ek-search']")).sendKeys("пошук товарів");

    }
}
