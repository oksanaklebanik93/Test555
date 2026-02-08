package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObgect {
    private WebDriver driver;

    public PageObgect(WebDriver driver) {
        this.driver = driver;
    }

    public void Username(String Username) {
        driver.findElement(By.xpath(".//input[@id='user-name']")).sendKeys(Username);
    }

    public void CustomerLogin() {
        driver.findElement(By.xpath(".//button[text()='Customer Login']")).click();
    }

    public void Name() {
        driver.findElement(By.xpath(".//select[@id='userSelect']")).click();
    }

    public void Punkt() {
        driver.findElement(By.xpath(".//option[text() = 'Harry Potter']")).click();
    }
    public void login(){
        driver.findElement(By.xpath(".//button[@class = 'btn btn-default']")).click();
    }
    public void deposit(){
        driver.findElement(By.xpath(".//button[@ng-click = 'deposit()']")).click();
    }
    public void type(String Username1){
        driver.findElement(By.xpath(".//input[@type='number']")).sendKeys(Username1);
    }
    public void depositbaton(){
        driver.findElement(By.xpath(".//button[@type='submit']")).click();
    }
    public void Openapp(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }
    public void pause(){
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}