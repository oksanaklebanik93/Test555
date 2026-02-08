package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mmm {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=D969CC6FF1DB38FCF5F8B70DD0924555");
        driver.findElement(By.xpath(".//input[@name='username']")).sendKeys("Max");
driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("1234567");
driver.findElement(By.xpath(".//input[@value='Log In']")).click();
driver.findElement(By.xpath(".//a[text()='Log Out']")). click();
    }
}
