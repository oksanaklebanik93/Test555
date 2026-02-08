package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObgect4 {
    private WebDriver driver;

    public PageObgect4(WebDriver driver) {
        this.driver = driver;
    }

    public void OpenSajt() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=D969CC6FF1DB38FCF5F8B70DD0924555");
    }

    public void AboutAs(){
        driver.findElement(By.xpath(".//a[text()='About Us']")).click();
    }
    public void Solutions() {
        driver.findElement(By.xpath(".//li[@class='Solutions']")).click();
    }
    public void Login(){
        driver.findElement(By.xpath(".//input[@name='username']")).sendKeys("Max");
    }
    public void Password(){
        driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("1234567");
    }
    public void LogIn(){
        driver.findElement(By.xpath(".//input[@value='Log In']")).click();
    }
}


