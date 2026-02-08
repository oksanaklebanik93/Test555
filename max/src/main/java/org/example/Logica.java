package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Logica {
    public static void main (String[] args) {
        WebDriver driver=new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.xpath(".//input[@id='login-button']")).click();
    }
}
